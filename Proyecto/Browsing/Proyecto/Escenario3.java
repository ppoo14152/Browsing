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
    
    /**public void act()
    {
    
    }*/
    
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
    
    public void tambahSkor()
    {
        punto.add(75);
    }
}
