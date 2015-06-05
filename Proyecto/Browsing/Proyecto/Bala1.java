import greenfoot.*;

/**
 * Clase de la bala2 la cual sera utilizada por el 
 * enemigo final 2
 * 
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
 */
public class Bala1 extends Movimientos
{
    /**
     * Act - do whatever the Bala1 wants to do. This method is called whenever
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
        int x=getX()+10, y= getY();
        setLocation(x,y);
    }
}
