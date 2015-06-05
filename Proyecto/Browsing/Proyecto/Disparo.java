import greenfoot.*;

/**
 * Clase del disparo para el jugador 1 
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 19 de abril del 2015
 * @version 22 de abril del 2015
 */  
public class Disparo extends Movimientos
{
    private Save jugador=new Save();
    private VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act() 
  {
        // Add your action code here.
    World miMundo = getWorld();
    Escenario1 escenario1 = (Escenario1)miMundo;
    VidaEnemigoF barraEne=escenario1.getbarraEne(); 
     move(-6); 
     if(isAtEdge())
     {
      getWorld().removeObject(this);
    }
      else
    if(isTouching(EnemCriatura.class))
      {
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY()); 
       ((Escenario1)getWorld()).aumentaPuntos(5);
       Greenfoot.playSound("blast.wav");
       getWorld().removeObject(this);
      }
      else
      if(isTouching(Enemigo1.class))
      {
       vidaE-=10;
       barraEne.detectaPresencia();
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());     
       ((Escenario1)getWorld()).aumentaPuntos(10);
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