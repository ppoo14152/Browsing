import greenfoot.*;

/**
 * Write a description of class DisparoCria1 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 */
public class DisparoCria1 extends Movimientos
{
   
    /**
     * Act - do whatever the DisparoCria1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
     move(1);
    if(isAtEdge())
      getWorld().removeObject(this);
     else if(isTouching(Barco1user.class))
        {
           removeTouching(Barco1user.class);
           Fuego fuego = new Fuego();
           getWorld().addObject(fuego, getX(), getY()); 
           
        getWorld().removeObject(this);
           
        
    }    
   
}
}
    

      
    
