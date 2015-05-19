import greenfoot.*;

/**
 * Write a description of class Creditos here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 22 de abril del 2015
 * 
 * clase para entra a ver los creditos del juego
 */
public class Creditos extends Botones
{
    public boolean usingA=true;
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this))
        {
            World myWorld = getWorld();
            Menu men = (Menu)myWorld;
           
            Greenfoot.playSound("splash.mp3");
            Greenfoot.delay(100);
            //men.stop();
            Greenfoot.setWorld(new Credit());
        }
        
        {
            if (Greenfoot.mouseMoved(null)) 
            {
                if (Greenfoot.mouseMoved(this) && !usingA) 
                {
                    setImage(new GreenfootImage("Creditbig.png"));
                    usingA =true;
                }
                if (!Greenfoot.mouseMoved(this) && usingA) 
                {
                    setImage(new GreenfootImage("Credit.png"));
                    usingA = false;
                }
            }

        }
        
    }    
}
