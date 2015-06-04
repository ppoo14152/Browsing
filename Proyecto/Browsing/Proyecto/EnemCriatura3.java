import greenfoot.*;

/**
 * Write a description of class EnemCriatura3 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 * 
 * clase para la criatura en el nivel dificil 
 */
public class EnemCriatura3 extends Movimientos
{
    private int q=0;
    private int rand;
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
    
    public EnemCriatura3()
    {
    }
    
    public void disparar()
    {
        //DisparoCri dc1 = new DisparoCri ();
         //getWorld().addObject(dc1,getX(),getY());
         q++;
         if(q==1)
        {
         
         Llamas lla = new Llamas ();
         getWorld().addObject(lla,getX(),getY());
         lla.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }
        
    }
}
