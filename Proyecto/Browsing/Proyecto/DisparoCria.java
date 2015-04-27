import greenfoot.*;


/**
 * Write a description of class DisparoEnf here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 25 de abril del 2015
 * 
 * clase para hacer el disparo de la criatura tipo extraterrestre
 */
public class DisparoCria extends Movimientos
{
    /**
     * Act - do whatever the DisparoCria wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(isAtEdge())
            getWorld().removeObject(this);
        else if(isTouching(Barco1user.class))
        {
           removeTouching(Barco1user.class);
           Fuego fuego = new Fuego();
           getWorld().addObject(fuego, getX(), getY()); 
    
           ((Escenario1)getWorld()).tambahSkor();
        
           Greenfoot.playSound("blast.wav");
               
           getWorld().removeObject(this);
           
    
}

}
}
