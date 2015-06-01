import greenfoot.*;

/**
 * Write a description of class Rocas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocas extends Movimientos
{
    /**
     * Act - do whatever the Rocas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getX()<getWorld().getWidth())
        mueve();
        else
        getWorld().removeObject(this);
       
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