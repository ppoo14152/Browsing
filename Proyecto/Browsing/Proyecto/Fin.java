import greenfoot.*;

/**
 * Write a description of class Fin here.
 * 
  * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 26 de mayo del 2015
 */
public class Fin extends World
{
    private GreenfootSound s;
        /**
     * Constructor for objects of class Fin.
     * 
     */
    public Fin(int sel)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        if(sel == 0)
        {
            Mensajes gano = new Mensajes(0);
            addObject(gano,460,265);
            s = new GreenfootSound("metal.mp3");
        }
        if(sel == 1)
        {
           Mensajes per = new Mensajes(1);
           addObject(per,460,265);
           s = new GreenfootSound("gameover.wav");
        }
        
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 902, 564);
        
    }
    
       public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
           if(!s.isPlaying())
            s.play();
           if(Greenfoot.mousePressed(new MainMenu()))
            {
                 s.stop();
                 Greenfoot.setWorld(new Menu());//Al presionar boton de regresar te manda a menu
            }
        }
    }
    
     /**
    * When the execution of the program stop the music stop too.
    */
    public void stopped()
    {
        s.stop();
    }
    
    /**
     * When the execution of the program is reanuded the music reanuded too.
     */
    public void started()
    {
        s.play();
    }
}
