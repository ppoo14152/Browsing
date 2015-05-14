import greenfoot.*;

/**
 * Write a description of class Barco3user here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * 
 * clase para el barco del usuario en el nivel 3
 */
public class Barco3user extends Movimientos
{
    private double lastShot;
    int count=0;
    /**
     * Act - do whatever the Barco3user wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(count==0)
        {
            setRotation(0);
        }
        if(count <= 2)
        {
            count++;
        }
        movimientos();
        disparar();
    }
    
    private void movimientos()
    {
        //mueve a el barco para la derecha
    if(Greenfoot.isKeyDown("right")){
     move(3);
    }
      //mueve a el barco para la izquierda
     else if(Greenfoot.isKeyDown("left")){
     move(-1);
    }
    //mover para arriba a el barco del usuario
    if(Greenfoot.isKeyDown("up")){
            turn(1);
        }
            //mover el barco del usuario a hacia abajo            
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-1);
        }
        }
        
    private void disparar()
    {
        if(("space").equals(Greenfoot.getKey()))
        //if (Greenfoot.isKeyDown("space"))//&& System.currentTimeMillis()>lastShot+300)
        {
           Disparo dis = new Disparo();
          
           getWorld().addObject(dis, getX(), getY());
           
           dis.turn(getRotation());
           //dis.setRotation(getRotation());
           //lastShot = System.currentTimeMillis();
           Greenfoot.playSound("kri-fire.wav");
        }
    }    
}
