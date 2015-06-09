import greenfoot.*;

/**
 * Clase para el disparo del enemigo 3 
 * 
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015) 
 * @author zarazua lopez vicente
 * @author zarazua lopez vicente
 * @version 29 de abril del 2015
 * 
 */
public class EnemCriatura2 extends Movimientos
{
     private SimpleTimer timer;
    /**
     * Act - do whatever the EnemCriatura2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
      {
         disparar();
        if(isTouching(Barco2user.class))
       {
        //((Escenario1)getWorld()).gameOver();
        Fuego fuego = new Fuego();
        getWorld().addObject(fuego, getX()+10, getY());
        getWorld().removeObject(this);   
     
       } 
      if(((Escenario2)getWorld()).punto.getValue()==100)
      {
        getWorld().removeObject(this);  
      }
    }
    
     /**
     * constructor de la clase criatura 2 que aparece en el segundo nivel 
     */
    public EnemCriatura2()
    {
        timer = new SimpleTimer();
    }
   
    /**
     *Metodo para el disparo de la criatura 2 
     */
    public void disparar()
    {
        if(timer.millisElapsed()/325>6)
           {     
              Rocas rc = new Rocas();
              getWorld().addObject(rc,getX(),getY());
              rc.setRotation(getRotation());
              timer.mark();
           }
    }
}
