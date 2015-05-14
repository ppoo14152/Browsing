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
    private int c=0;
    /**
     * Act - do whatever the EnemCriatura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // acciones que realizara el enemigo criatura como lo es el movimiento.
        //move(0.5);
        move(1);
        if(isAtEdge() || getX()>750) 
        {  
         turn(180);
         getImage().mirrorVertically();   
        
        } 
        
        disparar();
          
        }
     
    public void disparar()
    {
        mov();
        q++;
        if(q==1)
        {
         DisparoCria1 dc1 = new DisparoCria1 ();
         getWorld().addObject(dc1,getX(),getY());
         dc1.turn(getRotation());
        }
        if(q==4)
        {
            q=0;
        }
        
          if(isTouching(Barco1user.class))
        {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX(), getY());
            getWorld().removeObject(this);
        }
        }
        
        public void mov()
        {
            c= Greenfoot.getRandomNumber(5);
            move(c);
        }
    }
        
      