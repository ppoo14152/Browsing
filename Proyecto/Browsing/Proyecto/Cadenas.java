import greenfoot.*;

/**
 * Write a description of class Cadenas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cadenas extends Actor
{
    public int posiX = 0;
    public int posiY = 0;
    public String cadena1;
    /**
     * Act - do whatever the Cadenas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Cadenas(String cad)
    {
        cadena1 = cad;
    }
     public void despliegaTex(String cadena,int tam)
    {
        super.setImage(new GreenfootImage(cadena1+cadena,tam,java.awt.Color.YELLOW,null));
    }
}
