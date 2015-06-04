import greenfoot.*;

/**
 * Write a description of class EnemCriatura2 here.
 * 
 * @author zarazua lopez vicente
 * @author zarazua lopez vicente
 * @version 29 de abril del 2015
 * 
 * clase para la criatura la cual aparecera en el nivel medio
 */
public class EnemCriatura2 extends Movimientos
{
    private int q=0;
    private int rand;
    /**
     * Act - do whatever the EnemCriatura2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
      {
        // Add your action code here.
       //move(0.5);
        //if(isAtEdge() || getX()>750) 
        //{  
         //turn(180);
         //getImage().mirrorVertically();   
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
    
    public EnemCriatura2()
    {
    }
    
    public void disparar()
    {
         q++;
         if(q==1)
        {
         
         Rocas rc = new Rocas();
         getWorld().addObject(rc,getX(),getY());
         rc.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }
        
    }
}
