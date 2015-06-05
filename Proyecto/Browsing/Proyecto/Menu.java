import greenfoot.*;
import java.awt.*;
/**
 * clase Menu para ver la opcion de creditos, empezar
 * records y ayuda.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 23 de abril del 2015
 * @version fecha de modificacion 27 de abril del 2015
 * 
 */

public class Menu extends World
{
    /**
     * Constructor para la clase Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        //play();
        //loop();
        
    }
    
    //GreenfootSound bgMusic = new GreenfootSound("cheat.wav");
    /*   
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
    */
    /**
     * Metodo para añadir los botones para el juego
     */
    private void prepare()
    {
        addObject(new Start(), 650,300);
        addObject(new Creditos(), 650,500);
        addObject(new Ayuda(),500,400);
        addObject(new Records(),800,400);
        addObject(new NombreJuego(),500,50);
        
    }

}
