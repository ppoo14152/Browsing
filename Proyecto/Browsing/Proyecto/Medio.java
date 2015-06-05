import greenfoot.*;

/**
 * clase para entrar al seguno escenario
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 27 de abril del 2015
 * @version ultima modificacion 28 de abril del 2015
 * 
 */
public class Medio extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Medio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.mouseClicked(this))
        {
          World myWorld = getWorld();
            Dificultades dif = (Dificultades)myWorld;
            //dif.stop();

            Greenfoot.playSound("splash.mp3");
            Greenfoot.delay(250);

            Greenfoot.setWorld(new Escenario2());
        }
        {
        if (Greenfoot.mouseMoved(null)) 
            {
             if (Greenfoot.mouseMoved(this) && !usingA) 
               {
                setImage(new GreenfootImage("med2.png"));
                usingA =true;
               }
             if (!Greenfoot.mouseMoved(this) && usingA) 
              {
               setImage(new GreenfootImage("med1.png"));
               usingA = false;
              }
            }
        }
    }    
}
