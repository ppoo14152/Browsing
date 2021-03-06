import greenfoot.*;
/**
 * clase para el boton facil
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 */
public class Facil extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Facil wants to do. This method is called whenever
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

            Greenfoot.setWorld(new Escenario1());
        }
        {
        if (Greenfoot.mouseMoved(null)) 
            {
             if (Greenfoot.mouseMoved(this) && !usingA) 
               {
                setImage(new GreenfootImage("fac2.png"));
                usingA =true;
               }
             if (!Greenfoot.mouseMoved(this) && usingA) 
              {
               setImage(new GreenfootImage("fac1.png"));
               usingA = false;
              }
            }
        }
        
    }
}
