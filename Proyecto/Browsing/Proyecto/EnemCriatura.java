import greenfoot.*;

/**
 * Write a description of class EnemCriatura here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 15 de abril del 2015
 */
public class EnemCriatura extends Movimientos
{
    private int q=0;
    private int rand;
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
     
    public EnemCriatura()
    {
    }
   
    public void disparar()
    {
           
       q++;
         if(q==1)
        {
         
         DisparoCri dc1 = new DisparoCri ();
         getWorld().addObject(dc1,getX(),getY());
         dc1.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }
        
        }
    }
        
      