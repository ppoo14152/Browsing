import greenfoot.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 * clase para la vida del jugador 
 * la cual es de color verde
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 21 de mayo del 2015
 */
public class Vida extends Actor
{
    private int vida = 300;
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
    
    /**
     *constructor para la vida 
     */
    public Vida()
    {
        actualiza();
    }
    
    /**
     *metodo para actualizar la vida del jugador conforme lo dañen 
     */
    public void actualiza()
    {
        setImage(new GreenfootImage(VidaBarraAn + 1,VidaBarraAl + 1));
        GreenfootImage miImagen = getImage();
        miImagen.setColor(Color.WHITE);
        miImagen.drawRect(0,0,VidaBarraAn + 1,VidaBarraAl + 1);
        miImagen.setColor(Color.GREEN);
        miImagen.fillRect(1, 1,vida*pixelesBarra,VidaBarraAl);
        
    }
    
    /**
     *metodo para  restarle la vida a el jugador
     */
    public void detectaPresen()
    {
        vida--;
    }
}
