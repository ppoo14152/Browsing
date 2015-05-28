import greenfoot.*;

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends Botones
{
    public boolean usingA=true;
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
