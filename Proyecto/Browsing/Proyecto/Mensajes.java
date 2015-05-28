import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Mensajes here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 22 de mayo del 2015
 */
public class Mensajes extends Actor
{
     private ArrayList imagenes;
    /**
     * Act - do whatever the Mensajes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Mensajes(int sel)
    {
        imagenes = new ArrayList();
        imagenes.add(new GreenfootImage("fin.png"));
        imagenes.add(new GreenfootImage("gameover.png"));
        
        if(sel == 0)//condicional para establecer la funcion del la clase
        {
            setImage((GreenfootImage)imagenes.get(0));
        }
      if(sel == 1)//condicional para establecer la funcion del la clase
        {
            setImage((GreenfootImage)imagenes.get(1));
        }
    }
}
