import greenfoot.*;

/**
 *clase MasVida es para cuando el jugador toque la imagen de esta clase recupere
 *parte de su vida que a ido perdiendo.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version mayo del 2015
 */
public class MasVida extends Movimientos
{
    private Vida vidaBarra = new Vida();
    private int vida = 300;
    private GreenfootSound s;
    /**
     * Act - do whatever the MasVida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World miMundo = getWorld();
       Escenario1 escenario = (Escenario1)miMundo;
       Vida vidaBarra = escenario.getvidaBarra();
        move(0.5);
        turn(Greenfoot.getRandomNumber(11)-5);
        if(isAtEdge())
           {
            getWorld().removeObject(this);
          
          }
          else
       if(isTouching(Barco1user.class))
        {
         vida+=15;
         vidaBarra.sumavida();
         s= new GreenfootSound("ok.mp3");
         s.play();
         getWorld().removeObject(this);
       }
        }
    }