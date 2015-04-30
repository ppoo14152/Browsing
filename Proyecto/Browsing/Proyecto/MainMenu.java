import greenfoot.*;

/**
 * Write a description of class MainMenu here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 22 de abril del 2015
 * 
 * clase para el boton que hace que regresemos a el menu inicial
 */
public class MainMenu extends Botones
{
    /**
     * Act - do whatever the MainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }
    }    
}

