import greenfoot.*;
import java.awt.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Menu extends World
{
    private int i = 825;

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        play();
        loop();
        
    }
    
    GreenfootSound bgMusic = new GreenfootSound("cheat.wav");
        
    public void play()
    {
        bgMusic.play();
    }
    
    public void loop()
    {
        bgMusic.playLoop();
    }
    
    public void stop()
    {
      bgMusic.stop();
    }
    
    private void prepare()
    {
        addObject(new Start(), 700,400);
        addObject(new Creditos(), 700,500);
    }

}
