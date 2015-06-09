import greenfoot.*;

/**
 * clase para la criatura en el nivel dificil 
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 *
 */
public class EnemCriatura3 extends Movimientos
{
    private SimpleTimer timer;
        /**
     * Act - do whatever the EnemCriatura3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        disparar();
        
          if(isTouching(Barco1user.class))
        {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
            getWorld().removeObject(this);   
       
        }
        if(((Escenario3)getWorld()).punto.getValue()==150)
         {
         getWorld().removeObject(this);  
        }
    }
    
     /**
     * constructor de la clase criatura 3 que aparece en el 
     * nivel dificil 
     */
    public EnemCriatura3()
    {
        timer = new SimpleTimer();
    }
    
    /**
     *Metodo para el disparo de la cratura 3 
     */
    public void disparar()
    {
        if(timer.millisElapsed()/375>6)
           {   
            Llamas lla = new Llamas ();
            getWorld().addObject(lla,getX(),getY());
            lla.setRotation(getRotation());
            timer.mark();
        }
    }
}
