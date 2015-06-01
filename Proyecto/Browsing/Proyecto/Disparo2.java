import greenfoot.*;

/**
 * Write a description of class Disparo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo2 extends Movimientos
{
    /**
     * Act - do whatever the Disparo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
           move(-6);
         if(isAtEdge())
         {
            getWorld().removeObject(this);
        }
       if(isTouching(EnemCriatura2.class))
     {
       //removeTouching(EnemCriatura2.class);
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY()); 
           
       ((Escenario2)getWorld()).aumentaPuntos(20);
           
       Greenfoot.playSound("blast.wav");

       getWorld().removeObject(this);
          
     } 
     
    }    
}
