import greenfoot.*;

/**
 * Clase para el disparo del barco 3 
 * 
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
 */
public class Disparo3 extends Movimientos
{
    private Save jugador=new Save();
    private VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    
    /**
     * Act - do whatever the Disparo3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      World miMundo = getWorld();
      Escenario3 escenario3 = (Escenario3)miMundo;
      VidaEnemigoF barraEne=escenario3.getbarraEne(); 
      move(-6);
     if(isAtEdge())
      {
        getWorld().removeObject(this);
      }
      else
     if(isTouching(EnemCriatura3.class))
     {
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());  
       ((Escenario3)getWorld()).aumentaPuntos(15);
       Greenfoot.playSound("blast.wav");
       getWorld().removeObject(this);  
     }   
      else
      if(isTouching(Enemigo3.class))
      {
       vidaE-=20;
       barraEne.detectaPresencia();
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());     
       ((Escenario3)getWorld()).aumentaPuntos(20);
       Greenfoot.playSound("blast.wav");
       getWorld().removeObject(this);
      }
    }    
    
    /**
   * Metodo para regresar la vida del enemigo
   */
  public int getVidaE()
  {
    return vidaE;
  }
}
