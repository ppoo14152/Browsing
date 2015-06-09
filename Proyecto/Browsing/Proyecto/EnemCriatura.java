import greenfoot.*;

/**
 * Clase para la criatura que aparecera en el nivel 1
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 15 de abril del 2015
 */
public class EnemCriatura extends Movimientos
{
   
    private SimpleTimer timer;
    /**
     * Act - do whatever the EnemCriatura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // acciones que realizara el enemigo criatura como lo es el movimiento.
         disparar();
        if(isTouching(Barco1user.class))
         {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
        }
        
         if(((Escenario1)getWorld()).punto.getValue()==50)
         {
           getWorld().removeObject(this);  
         }
    }
     
    /**
     * constructor de la clase criatura 1 que aparece en el primer nivel 
     */
    public EnemCriatura()
    {
        timer = new SimpleTimer();
    }
    
    public void disparar()
    {      
          if(timer.millisElapsed()/400>6)
                {
                   
                  DisparoCri dc1 = new DisparoCri ();
                  getWorld().addObject(dc1,getX(),getY());
                  timer.mark();
                }
        }
    }
        
      