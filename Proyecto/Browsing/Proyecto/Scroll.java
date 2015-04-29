import greenfoot.*;

/**
 * Write a description of class Scroll here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 27 de abril del 2015
 * 
 * clase que realiza la simulacion como si fuera recorriendo distancias 
 */
public class Scroll extends World
{
    private GreenfootImage im;
    private int scrollDirX;
    private int scrollDirY;
    private int scrollSpeed;
    private int  scrollX;
    private int scrollY;

    /**
     * Constructor for objects of class Scroll.
     * 
     */
    public Scroll(int w, int h, int c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, c); 
    }
    /**
     * Constructor 2 para objetos de la clase Scroll
     */
    public Scroll(int w, int h, int c, boolean b)
    {
        super(w, h, c, b);
    }
    
    public void setDireccion(int dir)
    {
        dir = dir %4;
        scrollDirX = (1-dir) * ((dir+1) % 2);
        scrollDirY = (2-dir) * (dir % 2);
        
        im = new GreenfootImage(getBackground());
        scrollX = 0;
        scrollY = 0;
    }
    
    /**
     *  hacer el scroll para el fondo
     */
    public void scrollBackground()
    {
        scrollX = (scrollX - scrollDirX * scrollSpeed + getWidth()) % getWidth();
        scrollY = (scrollY - scrollDirY * scrollSpeed + getHeight()) %getHeight();
        
        getBackground().drawImage (im , scrollX * getCellSize(), scrollY * getCellSize());
        
        getBackground().drawImage(im,((scrollX - getWidth()) * scrollDirX * scrollDirX) *getCellSize(),
            ((scrollY - getHeight()) * scrollDirY * scrollDirY) * getCellSize());
        
        
        
    }
    
    public void scrollAll()
    {
        scrollBackground();
    }
    
    public void setActorAt(Actor actor, int x, int y)
    {
      if (actor.getWorld() != this){
       return;
    }
    setScrollSpeed(actor.getX()-x);
    setDireccion(0);
    scrollAll();
    setScrollSpeed(actor.getY()-y);
    setDireccion(1);
    scrollAll();
    }
    
    public int getDirectionX() 
    {
        return scrollDirX; 
    }
    
    public int getDirectionY() 
    {
         return scrollDirY; 
    }
    
    public int getScrollX() 
    {
        return scrollX; 
    }
    
    public int getScrollY() 
    {
        return scrollY; 
    }
    
    public int getScrollSpeed()
    {
       return scrollSpeed; 
    }
    
    public void setScrollSpeed(int speed) 
    {
       scrollSpeed = speed; 
    }
}
