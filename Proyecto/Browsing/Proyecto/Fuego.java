import greenfoot.*;

/**
 * Write a description of class Fuego here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version  21 de abril del 2015
 * 
 * clase para hacer la simulacion de esplocion
 */
public class Fuego extends Movimientos
{
    /**
     * Act - do whatever the Fuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer =0;
    public void act() 
    {
        // Add your action code here.
        timer ++;
        if (timer > 30){
            getWorld().removeObject(this);
        }
    }    
}