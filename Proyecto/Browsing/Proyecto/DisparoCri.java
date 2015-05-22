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
    /**
     * Act - do whatever the DisparoCria1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getX()>0)
        mueve();
        else
        getWorld().removeObject(this);
       
    }   
    
         /**
     * Metodo para mover los disparos de las criaturas
     */
    public void mueve()
    {
        int x=getX(), y= getY();
        setLocation(x,y);
    }
    
}

