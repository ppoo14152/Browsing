import greenfoot.*;

/**
 * Write a description of class Barco2user here.
 * 
 * @author zarazua lopez vicente
 * @author jacobotovar efrain
 * @version 28 de abril del 2015
 * 
 * clase para el jugador en el nivel medio
 */
public class Barco2user extends Movimientos
{
    /**
     * Act - do whatever the Barco2user wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        
        //mueve a el barco para la derecha
        if(Greenfoot.isKeyDown("right")){
            move(3);
           }
            //mueve a el barco para la izquierda
        else if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        
        //mover para arriba a el barco del usuario
        if(Greenfoot.isKeyDown("up"))
            turn(1);
            //mover el barco del usuario a hacia abajo            
        else if(Greenfoot.isKeyDown("down"))
            turn(-1);
         
        if(("space").equals(Greenfoot.getKey()))
        {
           Disparo dis = new Disparo();
          
           getWorld().addObject(dis, getX(), getY());
           
           dis.turn(getRotation());
           
           Greenfoot.playSound("kri-fire.wav");
        }
    }    
}
