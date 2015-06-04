import greenfoot.*;

/**
 * Write a description of class Bala2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala2 extends Movimientos
{
    /**
     * Act - do whatever the Bala2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isAtEdge())
        {
          getWorld().removeObject(this);
        }
        else
        if(getX()<getWorld().getWidth())
        {
          mueve();
        }
        
    }    
    
      /**
     * Metodo para mover los disparos de los barcos finales
     */
    public void mueve()
    {
        int x=getX()+11, y= getY();
        setLocation(x,y);
    }
}
