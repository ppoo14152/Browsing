import greenfoot.*;

/**
 * Clase Llamas la cual sera utilizada por el dragon 
 * que aparece en el nivel 3
 *
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
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
          if(isTouching(Barco3user.class))
      {
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY()); 
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
