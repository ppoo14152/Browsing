import greenfoot.*;

/**
 * clase del boton ayuda para poder desplegar la informacion 
 * que nos sera de utilidad en el juego
 * 
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
 */
public class Ayuda extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            World myWorld = getWorld();
            Menu men = (Menu)myWorld;
            //men.stop();

            Greenfoot.playSound("splash.mp3");
            Greenfoot.delay(100);
            Greenfoot.setWorld(new Help());

        }
        {
            if (Greenfoot.mouseMoved(null)) 
            {
                if (Greenfoot.mouseMoved(this) && !usingA) 
                {
                    setImage(new GreenfootImage("ayuda2.png"));
                    usingA =true;
                }
                if (!Greenfoot.mouseMoved(this) && usingA) 
                {
                    setImage(new GreenfootImage("ayuda1.png"));
                    usingA = false;
                }
            }
        }   
    }
    }    

