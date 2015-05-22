import greenfoot.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    private int vida = 100;
    private int VidaBarraAn = 300;
    private int VidaBarraAl = 25;
    private int pixelesBarra = (int)VidaBarraAn/vida;
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        actualiza();
    }
    
    public Vida()
    {
        actualiza();
    }
    
    public void actualiza()
    {
        setImage(new GreenfootImage(VidaBarraAn + 1,VidaBarraAl + 1));
        GreenfootImage miImagen = getImage();
        miImagen.setColor(Color.WHITE);
        miImagen.drawRect(0,0,VidaBarraAn + 1,VidaBarraAl + 1);
        miImagen.setColor(Color.GREEN);
        miImagen.fillRect(1, 1,vida*pixelesBarra,VidaBarraAl);
        
    }
    
    public void detectaPresen()
    {
        vida --;
    }
}
