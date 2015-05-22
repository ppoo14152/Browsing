import greenfoot.*;

/**
 * Write a description of class ImgScroll here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 21 de abril del 2015
 * @version ultima modificacion 04 de mayo del 2015
 */
public class ImgScroll 
{
     private World scrollWorld; 
    private GreenfootImage[][] scrollIma;  
    private int scrollWidth, scrollHeight; // area de las dimensiones del scroll
    private int worldWidth, worldHeight; //  dimensiones de el area de juego(escenario)
    private int xScrAmt, yScrAmt; //
    /**
     * Act - do whatever the ImgScroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    /**
     */
    public ImgScroll(World scrWorld, GreenfootImage scrIma)
    {
        this(scrWorld, scrIma, scrIma.getWidth(), scrIma.getHeight());
    }
    
    /**
     */
    public ImgScroll(World scrWorld, GreenfootImage repImage, int ancho, int alto)
    {
        scrollWorld = scrWorld;
        worldWidth = scrWorld.getWidth();
        worldHeight = scrWorld.getHeight();
        scrollWidth = ancho;
        scrollHeight = alto;
        
        if (repImage == null) repImage = scrWorld.getBackground();
        GreenfootImage scrIma = new GreenfootImage(ancho, alto);
        scrIma.setColor(java.awt.Color.white);
        scrIma.fill(); 
        for (int i=0; i<ancho; i+=repImage.getWidth())
            for (int j=0; j<alto; j+=repImage.getHeight())
                scrIma.drawImage(repImage, i, j);
        
        int x = 1+scrollWidth/worldWidth; 
        int y = 1+scrollHeight/worldHeight; 
        scrollIma = new GreenfootImage[y][x]; 
        for (int j=0; j<y; j++) for (int i=0; i<x; i++) 
        {
            scrollIma[j][i] = new GreenfootImage(worldWidth, worldHeight);
            scrollIma[j][i].drawImage(scrIma, -i*worldWidth, -j*worldHeight);
        }
        scrollBackground(); 
    }
    
    /** 
    */
    private void scrollBackground()
    {
        int x = (-xScrAmt)/worldWidth; 
        int y = (-yScrAmt)/worldHeight; 
        int dx = -((-xScrAmt)%worldWidth); 
        int dy = -((-yScrAmt)%worldHeight); 
        GreenfootImage bg = scrollWorld.getBackground(); 
        bg.drawImage(scrollIma[y][x], dx, dy);
        if (dx != 0) 
            bg.drawImage(scrollIma[y][x+1], dx+worldWidth, dy);
        if (dy != 0) 
            bg.drawImage(scrollIma[y+1][x], dx, dy+worldHeight);
        if (dx != 0 && dy != 0) // draw bottom-right image if needed
            bg.drawImage(scrollIma[y+1][x+1], dx+worldWidth, dy+worldHeight);
    }
    
    /** 
     
     */
    public void scroll(int dx, int dy)
    {
        
        if (dx > 0 && xScrAmt+dx > 0) dx = -xScrAmt;
        if (dx < 0 && xScrAmt+dx <= worldWidth-scrollWidth)
            dx = (worldWidth-scrollWidth)-xScrAmt;
        if (dy > 0 && yScrAmt+dy > 0) dy = -yScrAmt;
        if (dy < 0 && yScrAmt+dy <= worldHeight-scrollHeight)
            dy = (worldHeight-scrollHeight)-yScrAmt;
        
        xScrAmt += dx;
        yScrAmt += dy;
       
        scrollBackground();
        
        for (Object obj : scrollWorld.getObjects(null))
        {
            Actor actor = (Actor) obj;
            actor.setLocation(actor.getX()+dx, actor.getY()+dy);
        }
    }
    
    /** 
       */
    public int getScrolldX()
    {
        return xScrAmt;
    }
    
    /** 
       */
    public int getScrolldY()
    {
        return yScrAmt;
    }
    
    /** 
      */
    public int getScrollWidth()
    {
        return scrollWidth;
    }
    
    /** */
    public int getScrollHeight()
    {
        return scrollHeight;
    }
}
