import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Puntos here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 21 de abril del 2015
 * 
 * clase para realizar el contador de puntos
 */
public class Puntos extends Actor
{
     /**
     * Act - do whatever the Puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Color transparent = new Color (0, 0, 0, 0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
   
    /**
     * simula el display segun los puntos de la targeta
     */
    public void act()
    {
         if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }
    
    public Puntos()
    {
        this(new String());
    }
    
    /**
     * crea un nuevo contador para los puntos, inicializandolos en 0
     */
    public Puntos(String prefix)
    {
        background = getImage();
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Se añaden las nuevas puntuaciones segun el contador 
     */
    public void add(int score)
    {
        target += score;
    }
    
    /**
     * regresa el conteo actual 
     */
    public int getValue()
    {
        return target;
    }
    
    /**
     * 
     */
    public void setValue(int newEval)
    {
        target = newEval;
        value = newEval;
        updateImage();
    }
    
    /**
     * 
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * 
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.RED, transparent);
        if(text.getWidth() > image.getWidth() - 20){
        image.scale(text.getWidth() + 20, image.getHeight());
        }
         image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
        
    }
    

