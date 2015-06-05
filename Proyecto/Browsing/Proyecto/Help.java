import greenfoot.*;

/**
 * clase para poder entrar a conocer la ayuda que nos servirar para saber 
 * como movernos en el escenario
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 21 de mayo del 2015
 */
public class Help extends World
{

    /**
     * Constructor para de la clase Help 
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 902, 564);
    }
}

