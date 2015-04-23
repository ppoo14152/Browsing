import greenfoot.*;

/**
 * Write a description of class Escenario1 here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 13 de abril del 2015
 * @version ultima modificacion 21 de abril del 2015
 */

public class Escenario1 extends World
{
    int timeSpawn = 0;
    Puntos punto = new Puntos("Puntuacion : ");

    public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;                     
        }
    }
    
    
    /**
     * Constructor del escenario1
     * 
     */
    public Escenario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
       
        prepare();
    }
    
    private void prepare()
    {
      addObject(punto, 555, 27);   
    }
    
     public void tambahSkor()
    {
        punto.add(50);
    }
}
