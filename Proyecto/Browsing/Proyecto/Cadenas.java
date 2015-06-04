import greenfoot.*;

/**
 * Write a description of class Cadenas here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 22 de mayo del 2015
 */
public class Cadenas extends Actor
{
    private int posiX = 0;
    private int posiY = 0;
    private String cadena1;
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
        super.setImage(new GreenfootImage(cadena1+cadena,tam,java.awt.Color.RED,null));
    }
}
