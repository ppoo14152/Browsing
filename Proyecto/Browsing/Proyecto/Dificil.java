import greenfoot.*;

/**
 * clase para entrar a el escenario 3 que es el mas dificil 
 *
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 13 de abril del 2015
 * @version ultima modificacion 21 de abril del 2015
 * 
 */
public class Dificil extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Dificil wants to do. This method is called whenever
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

            Greenfoot.setWorld(new Escenario3());
        }
        {
        if (Greenfoot.mouseMoved(null)) 
            {
             if (Greenfoot.mouseMoved(this) && !usingA) 
               {
                setImage(new GreenfootImage("dif2.png"));
                usingA =true;
               }
             if (!Greenfoot.mouseMoved(this) && usingA) 
              {
               setImage(new GreenfootImage("dif1.png"));
               usingA = false;
              }
            }
        }
    }    
}
