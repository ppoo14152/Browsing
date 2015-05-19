import greenfoot.*;

/**
 * Write a description of class Escenario2 here.
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar  
 * @version 27 de abril del 2015
 * 
 * clase para la dificultad media
 */
public class Escenario2 extends World
{
    int timeSpawn = 0;
    Puntos punto = new Puntos("Puntos : ");
    GreenfootSound bgMusic = new GreenfootSound("bg.wav");

    
    public void createEnemCriatura2()
    {
        EnemCriatura ene = new EnemCriatura();
        //addObject(ene, Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(75));
        //ene.turn(Greenfoot.getRandomNumber(100));
    }
    /**
     * Constructor for objects of class Escenario2.
     * 
     */
    public Escenario2()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        play();
        loop();
    }
    
    //public void act()
    //{
    
    //}
    
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
        Barco2user bar2 = new Barco2user();
        addObject(bar2,800,500);
        //bar2.setLocation(293,366);
    }
    
    public void tambahSkor()
    {
        punto.add(50);
    }
}
