import greenfoot.*;

/**
 * clase para poner el nombre del juego en la portada 
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 29 de abril del 2015
 * 
 */
public class NombreJuego extends Botones
{
    private GreenfootImage[] nomj;
    private int cuenta;
    private int cont;
    private int numImagen;
    /**
     * Act - do whatever the NombreJuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        NombreJuego();
    
     }
     
    public void NombreJuego()
    {
        nomj = new GreenfootImage[1];
        cont =1;
        cuenta =0;
        numImagen =0;
        for (int i=0;i<1;i++)
        {
            nomj[i] = new GreenfootImage("logo"+i+".png");
        }
        //setImage(nomj[0]);
    }
}