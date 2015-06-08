import greenfoot.*;

/**
 * clase del disparo de la criatura 1 el cual esta
 * ligado a ella
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
        if(isAtEdge())
        {
          getWorld().removeObject(this);
        }
        else
      if(isTouching(Barco1user.class))
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

