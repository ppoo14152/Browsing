import greenfoot.*;

/**
 * Write a description of class Credit here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 17 de abril del 2015
 * @version ultima modificacion 21 de abril del 2015
 * 
 * clase para mostrar los creditos del juego
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 102, 564);
    }
}
