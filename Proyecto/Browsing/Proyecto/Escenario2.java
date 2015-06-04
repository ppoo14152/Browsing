import greenfoot.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
/**
 * Write a description of class Escenario2 here.
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar  
 * @version 27 de abril del 2015
 * 
 * clase para la dificultad media
 */
public class Escenario2 extends World
{
    int timeSpawn = 0;
    Counter punto = new Counter("Puntos : ");
    GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    private ImgScroll scroll;
    private int vScroll;
    Vida vidaBarra = new Vida();
    VidaEnemigoF barraEne = new VidaEnemigoF();
  
    /**
     * Constructor for objects of class Escenario2.
     * 
     */
    public Escenario2()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
       setBackground ("ecen2.png");
       getBackground().setColor(Color.BLACK);
       getBackground().fill();
        prepare();
        prepare1();
        play();
        loop();
    }
    
    public Vida getvidaBarra()
    {
        return vidaBarra;
    }
    
    public VidaEnemigoF getbarraEne()
    {
        return barraEne;
    }
    
    public void act()
    {
      timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
          }
        
      scrollWorld();
    }
    
    public void play()
    {
        bgMusic.play();
    }
    
    public void stop()
    {
        bgMusic.stop();
    }
    
    public void loop()
    {
        bgMusic.playLoop();
    }
    
    /**
     * Metodo para agregar los elementos a el escenario
     */
    public void prepare()
    {
      setBackground ("ecen2.png");
      setPaintOrder(Vida.class);
      getBackground().scale(1000,600);
      addObject(vidaBarra,825,25);
      /////////////vida para el enemigo final//////////////
      setPaintOrder(VidaEnemigoF.class);
      getBackground().scale(1000,600);
      addObject(barraEne,280,25);
      
      addObject(punto, 500, 27);
      
      
      Barco2user bar2 = new Barco2user();
      addObject(bar2,800,500);
        //bar2.setLocation(293,366);
        
      vScroll = 0;
    }
    
    public void prepare1()
    {
      EnemCriatura2 enecri = new EnemCriatura2();
      EnemCriatura2 enec = new EnemCriatura2();
      addObject(enecri,100,520);
      addObject(enec,100,410);
      
    }
    
    public void creaEne2()
    {
     Enemigo2 ene2 = new Enemigo2();
     addObject(ene2,100,440);   
    }
    /**
     * 
     */
    public void aumentaPuntos(int cant)
    {
        punto.add(cant);
    }
   
    /**
     * Realiza el apararente movimiento del mundo.
     */
    private void scrollWorld()  
    {  
        GreenfootImage bg = new GreenfootImage(getBackground());  
        getBackground().drawImage(bg, -1, 0);  
        getBackground().drawImage(bg, getWidth()-1, 0);  
    }

    /**
     * @return vScrolll que es la velocidad de Scroll del mundo.
     */
    public int getVScroll()
    {
        return vScroll;
    }

    /**
     * para incrementr la suma a la velocidad de vScroll.
     */
    public void setVScroll(int increment)
    {
        vScroll+=increment;
    }
}


