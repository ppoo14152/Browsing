import greenfoot.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 * clase para representar la vida del enemigo final
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar  
 * @version 21 de mayo del 2015
 */
public class VidaEnemigoF extends Actor
{
    private int vidaEne = 100;
    private int VidaBarraAn = 300;
    private int VidaBarraAl = 25;
    private int pixelesBarra = (int)VidaBarraAn/vidaEne;
    /**
     * Act - do whatever the VidaEnemigoF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         actualizaE();
    }
    
    /**
     *metodo para llamar la actualizacion de la vida  
     */
    public VidaEnemigoF()
    {
      actualizaE();
    }
    
    /**
     *Metodo para que se actualize la barra de vida del enemigo el cual
     *con el daño que se le haga puede ir cambiado
     */
    public void actualizaE()
    {
        setImage(new GreenfootImage(VidaBarraAn + 1,VidaBarraAl + 1));
        GreenfootImage miImagen = getImage();
        miImagen.setColor(Color.GREEN);
        miImagen.drawRect(0,0,VidaBarraAn + 1,VidaBarraAl + 1);
        miImagen.setColor(Color.YELLOW);
        miImagen.fillRect(1, 1,vidaEne*pixelesBarra,VidaBarraAl);
        
    }
    
    /**
     *Metodo para que cuando se le haga daño le reste vida 
     */
    public void detectaPresencia()
    {
        vidaEne--;
    }
}

    