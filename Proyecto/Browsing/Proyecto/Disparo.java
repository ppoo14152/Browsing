import greenfoot.*;

/**
 * Write a description of class Disparo here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 19 de abril del 2015
 * @version 22 de abril del 2015
 */  
public class Disparo extends Movimientos
{
    
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-1);
        if(isAtEdge())
            getWorld().removeObject(this);
        else if(isTouching(EnemCriatura.class))
        {
           removeTouching(EnemCriatura.class);
           Fuego fuego = new Fuego();
           getWorld().addObject(fuego, getX(), getY()); 
           
           ((Escenario1)getWorld()).tambahSkor();
           
           Greenfoot.playSound("blast.wav");

           getWorld().removeObject(this);
           
        }
        
        
        
    }   
    
}