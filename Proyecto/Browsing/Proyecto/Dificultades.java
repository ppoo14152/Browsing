import greenfoot.*;

/**
 * Clase para donde se muestran las diferentes dificultades que existenpara el juego
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 27 de abril del 2015
 * @version ultima modificacion 28 de abril del 2015
 */
public class Dificultades extends World
{
    /**
     * Constructor for objects of class Dificultades.
     * 
     */
    public Dificultades()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 502, 564);
        prepare();
    }
    
    /**
     * metodo para activar los objetos que apareceran en un nivel
     */
    private void prepare()
    {
        addObject(new Facil(),525,250);
        addObject(new Medio(),150,400);
        addObject(new Dificil(),850,400);
        
    }
}
