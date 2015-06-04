import greenfoot.*;

/**
 * Write a description of class Enemigo2 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * @version fecha ultima de modificacion 29 de abril del 2015
 */
public class Enemigo2 extends Movimientos
{
     private int q=0;
    /**
     * Act - do whatever the Enemigo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        disparo();
        if(isTouching(Barco2user.class))
         {
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
        }
    }    
    
    public void disparo()
    {
        q++;
         if(q==1)
        {
         
         Bala2 b2 = new Bala2();
         getWorld().addObject(b2,getX(),getY());
         b2.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }   
    }
}
