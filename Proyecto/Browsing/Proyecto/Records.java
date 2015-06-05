import greenfoot.*;

/**
 * clase para el boton de los records el cual nos guardar los 
 * jugadores que han podido entrar en la lista
 * 
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (mayo del 2015)
 */
public class Records extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Records wants to do. This method is called whenever
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
             Greenfoot.setWorld(new Record());

        }
        {
            if (Greenfoot.mouseMoved(null)) 
            {
                if (Greenfoot.mouseMoved(this) && !usingA) 
                {
                    setImage(new GreenfootImage("records2.png"));
                    usingA =true;
                }
                if (!Greenfoot.mouseMoved(this) && usingA) 
                {
                    setImage(new GreenfootImage("record1.png"));
                    usingA = false;
                }
            }
        }
    }    
}
