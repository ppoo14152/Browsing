import greenfoot.*;

/**
 *clase del boton star para poder entra a el menu de dificultades
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain 
 * @version 23 de abril del 2015
 * 
 */
public class Start extends Botones
{
    private boolean usingA=true;
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
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
            Greenfoot.delay(250);

            Greenfoot.setWorld(new Dificultades());
        }
        
        {
            if (Greenfoot.mouseMoved(null)) 
            {
                if (Greenfoot.mouseMoved(this) && !usingA) 
                {
                    setImage(new GreenfootImage("Startbig.png"));
                    usingA =true;
                }
                if (!Greenfoot.mouseMoved(this) && usingA) 
                {
                    setImage(new GreenfootImage("Start.png"));
                    usingA = false;
                }
            }
        }   
    }  
}
