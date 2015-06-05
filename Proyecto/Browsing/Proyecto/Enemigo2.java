import greenfoot.*;

/**
 * Clase del enemigo final 2 que aparecera en el nivel medio
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * @version fecha ultima de modificacion 29 de abril del 2015
 */
public class Enemigo2 extends Movimientos
{
     private int bala=0;
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
    
    /**
     *Metodo para disparar de el enemigo 2 que esta en el nivel 2  
     */
    public void disparo()
    {
        bala++;
         if(bala==1)
        {
         
         Bala2 b2 = new Bala2();
         getWorld().addObject(b2,getX(),getY());
         b2.setRotation(getRotation());
        }
        if(bala==50)
        {
         bala=0;
        }   
    }
}
