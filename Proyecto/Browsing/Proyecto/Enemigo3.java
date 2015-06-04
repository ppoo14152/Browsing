import greenfoot.*;

/**
 * Write a description of class Enemigo3 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 * 
 * clase para el enemigo 3 que aparecera a el final del nivel dificil
 */
public class Enemigo3 extends Movimientos
{
    private int q=0;
    /**
     * Act - do whatever the Enemigo3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         disparo();
         if(isTouching(Barco3user.class))
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
         
         Bala3 b3 = new Bala3();
         getWorld().addObject(b3,getX(),getY());
         b3.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }   
    }
}
