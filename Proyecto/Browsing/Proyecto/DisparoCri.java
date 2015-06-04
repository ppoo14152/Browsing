import greenfoot.*;

/**
 * Write a description of class DisparoCria1 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 */
public class DisparoCri extends Movimientos
{
    private int rand;
    /**
     * Act - do whatever the DisparoCria1 wants to do. This method is called whenever
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
     * Metodo para mover los disparos de las criaturas
     */
    public void mueve()
    {
        int x=getX()+10, y= getY();
        setLocation(x,y);
    }
    
    
}

