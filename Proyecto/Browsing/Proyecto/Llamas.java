import greenfoot.*;

/**
 * Write a description of class Llamas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Llamas extends Movimientos
{
    /**
     * Act - do whatever the Llamas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
