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
    int q=0;
    /**
     * Act - do whatever the EnemCriatura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // acciones que realizara el enemigo criatura como lo es el movimiento.
        move(0.5);
        if(isAtEdge() || getX()>750) 
        {  
         turn(180);
         getImage().mirrorVertically();   
        }  
          
        }
    }     
        /**
        DisparoCria dc = new DisparoCria();
        
        getWorld().addObjects(dc, getX(),getY());
        dc.turn(getRotation());
        
        if (isTouching(Barco1user.class)){
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego,getX(),getY());
        }
    }*/
 