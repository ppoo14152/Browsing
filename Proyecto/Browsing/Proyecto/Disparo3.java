import greenfoot.*;

/**
 * Write a description of class Disparo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo3 extends Movimientos
{
    /**
     * Act - do whatever the Disparo3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
           // Add your action code here.
        move(-6);
     if(isAtEdge())
      {
        getWorld().removeObject(this);
      }
      else
     if(isTouching(EnemCriatura3.class))
     {
       //removeTouching(EnemCriatura3.class);
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY()); 
           
       ((Escenario3)getWorld()).aumentaPuntos(30);
           
       Greenfoot.playSound("blast.wav");

       getWorld().removeObject(this);  
     } 
    }    
}
