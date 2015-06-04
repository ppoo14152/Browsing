import greenfoot.*;

/**
 * Write a description of class Disparo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo2 extends Movimientos
{
    private Save jugador=new Save();
    VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    /**
     * Act - do whatever the Disparo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
      World miMundo = getWorld();
      Escenario2 escenario2 = (Escenario2)miMundo;
      VidaEnemigoF barraEne=escenario2.getbarraEne();
           move(-6);
         if(isAtEdge())
         {
            getWorld().removeObject(this);
        }
        else
       if(isTouching(EnemCriatura2.class))
     {
       //removeTouching(EnemCriatura2.class);
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());     
       ((Escenario2)getWorld()).aumentaPuntos(10);
       Greenfoot.playSound("blast.wav");
       getWorld().removeObject(this);     
     } 
      else
      if(isTouching(Enemigo2.class))
      {
       vidaE-=10;
       barraEne.detectaPresencia();
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());     
       ((Escenario2)getWorld()).aumentaPuntos(15);
       Greenfoot.playSound("blast.wav");
       getWorld().removeObject(this);
       //Fuego fuego = new Fuego();
       //getWorld().addObject(fuego, getX(), getY());
      }
    }    
    
  public int getVidaE()
  {
    return vidaE;
  }
}
