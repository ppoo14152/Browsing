import greenfoot.*;

/**
 * clase Meteoro es aquella que aparecera de manera aleatoria, 
 * este a la vez le restara vida a el jugador
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (junio del 2015)
 */
public class Meteoro extends Movimientos
{
    private boolean direccion;
    /**
     * Act - do whatever the Meteoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getY()<getWorld().getHeight()-1)
         mueve();
         else
          getWorld().removeObject(this);
           
        
    }    
    
    /**public void mueve()
    {
        int x=getX(), y= getY();
        setLocation(x,y+2);
    }*/
    
        public void mueve()
    {
        if(getY()<getWorld().getHeight()&&getX()>0&&getX()<getWorld().getWidth())
            move(1);
        else
            getWorld().removeObject(this);
    }
}
