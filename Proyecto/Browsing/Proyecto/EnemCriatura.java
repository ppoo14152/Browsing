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
    
    /**
     * Act - do whatever the EnemCriatura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // acciones que realizara el enemigo criatura como lo es el movimiento.
         
        
        //if(isAtEdge() || getX()>750) 
        if(q%2==0)
        {  
         //turn(180);
        // getImage().mirrorVertically();   
         //if(q%2==0)
          //  {
              
                disparar();
                
                q=q%2;
                q+=1;
                
          }
            else 
                q+=1;
         
       
          if(isTouching(Barco1user.class))
        {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
            getWorld().removeObject(this);   
       
        }
    }
     
    public EnemCriatura()
    {
        q=0;
    }
    
    public void disparar()
    {
       
        
        //DisparoCri dc1 = new DisparoCri ();
         //getWorld().addObject(dc1,getX(),getY());
         //q++;
         //if(q==1)
        //{
         
         DisparoCri dc1 = new DisparoCri ();
         getWorld().addObject(dc1,getX(),getY());
         //dc1.turn(getRotation());
        //}
        //if(q==4)
        //{
         //q=0;
        //}
        
        }
       
    }
        
      