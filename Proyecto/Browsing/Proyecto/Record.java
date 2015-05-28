import greenfoot.*;

/**
 * Write a description of class Record here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 25 de mayo del 2015
 */
public class Record extends World
{
    private GreenfootSound s;
    private ScoreBoard t;

    /**
     * Constructor for objects of class Record.
     * 
     */
    public Record()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 902, 564);
        s = new GreenfootSound("metal.mp3");
        t = new ScoreBoard(100,400);
        addObject(t,getWidth()/2,getHeight()/2);
    }
    
      
    /**
     * Its the act method that check which button was touched.
     */
    public void act()
    {
        if(!s.isPlaying())
            s.play();
        if(Greenfoot.mousePressed(new MainMenu()))
         {
             s.stop();
             Greenfoot.setWorld(new Menu());
         }
    }
    
    /**
    * When the execution of the program stop the music stop too.
    */
    public void stopped()
    {
        s.pause();
    }
    
    /**
     * When the execution of the program is reanuded the music reanuded too.
     */
    public void started()
    {
        s.play();
    }
}
