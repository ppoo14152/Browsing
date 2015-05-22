import greenfoot.*;

/**
 * Write a description of class Escenario3 here.
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 27 de abril del 2015
 * @version ultima modificacion 28 de abril del 2015
 * 
 * clase para la dificultad dificil
 */
public class Escenario3 extends World
{
    int timeSpawn = 0;
    Puntos punto = new Puntos("Puntos : ");
    GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    private int vScroll;
    /**
     * Constructor for objects of class Escenario3.
     * 
     */
    public Escenario3()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        play();
        loop();
        
    }
    
    public void act()
    {
       scrollWorld();
    }
    
    public void play()
    {
        bgMusic.play();
    }
    
    public void stop()
    {
        bgMusic.stop();
    }
    
    public void loop()
    {
        bgMusic.playLoop();
    }
    /**
     * Metodo para agregar los elementos a el escenario
     */
    public void prepare()
    {
        addObject(punto,300,30);
        Barco3user bar3 = new Barco3user();
        addObject(bar3,800,500);
        //bar2.setLocation(293,366);
    }
     /**
     * Metodo para la puntuacion
     */
     public void tambahSkor()
    {
        punto.add(50);
    }
    
    /**
     * Realiza el apararente movimiento del mundo.
     */
    private void scrollWorld()  
    {  
        GreenfootImage bg = new GreenfootImage(getBackground());  
        getBackground().drawImage(bg, -1, 0);  
        getBackground().drawImage(bg, getWidth()-1, 0);  
    }

    /**
     * @return vScrolll que es la velocidad de Scroll del mundo.
     */
    public int getVScroll()
    {
        return vScroll;
    }

    /**
     * para incrementr la suma a la velocidad de vScroll.
     */
    public void setVScroll(int increment)
    {
        vScroll+=increment;
    }
}
