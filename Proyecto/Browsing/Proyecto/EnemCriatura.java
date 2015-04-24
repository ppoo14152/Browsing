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
        //turn(Greenfoot.getRandomNumber(11)-1);
        if(isAtEdge()) {
        //turn(0);
        //move(0.5);
            int i=Greenfoot.getRandomNumber(4);
            this.setImage((i+1)+".gif");
        
            setLocation(getX(), Greenfoot.getRandomNumber(600));
            turn(180);
               
            q++;
        if (q%2==1){
                this.getImage().mirrorVertically();
            }
        }
    }
    }    


