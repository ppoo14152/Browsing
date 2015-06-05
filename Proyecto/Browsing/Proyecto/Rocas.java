import greenfoot.*;

/**
 * Clase Rocas la cual sera utilizada por la criatura
 * que aparece en el nivel 2
 *
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
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