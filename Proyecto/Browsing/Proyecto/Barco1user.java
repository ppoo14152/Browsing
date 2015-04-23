import greenfoot.*;
/**
 * Write a description of class barco1 here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar
 * @version 15 de abril del 2015
 * @version 22 de abril del 2015 //agregar sonido de disparo
 */
public class Barco1user extends Movimientos
{
    /**
     * Act - do whatever the barco1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //mueve a el barco para arriba
        if(Greenfoot.isKeyDown("right")){
            move(3);
           }
            //mueve a el barco para abajo
        else if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        
        //mover a la derecha a el barco del usuario
        if(Greenfoot.isKeyDown("up"))
            turn(1);
            //mover el barco del usuario a la izquierda            
        else if(Greenfoot.isKeyDown("down"))
            turn(-1);
         
        if(("space").equals(Greenfoot.getKey()))
        {
           Disparo dis = new Disparo();
          
           getWorld().addObject(dis, getX(), getY());
           
           dis.turn(getRotation());
           
           Greenfoot.playSound("kri-fire.wav");
        }
        
        if(isTouching(EnemCriatura.class))
        {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX(), getY());
            getWorld().removeObject(this);
        }
    }    
}