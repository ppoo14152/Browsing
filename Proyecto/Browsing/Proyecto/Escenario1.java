
import greenfoot.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

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
   private int timeSpawn = 0;
   Counter punto = new Counter("Puntos : ");
   GreenfootSound bgMusic = new GreenfootSound("bg.wav");
   private ImgScroll scroll;
   private int vScroll;
   Vida vidaBarra = new Vida();
   VidaEnemigoF barraEne = new VidaEnemigoF();
    
    public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
        }
        
        //if(vScroll != 0)
           scrollWorld();
        
    }
    
    /**
     * Constructor del escenario1
     * 
     */
    public Escenario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1,true); 
       
        setBackground ("ecenario1.png");
       getBackground().setColor(Color.BLACK);
       getBackground().fill();
       prepare();
       Prepare1();
        play();
        loop();
    }
    
    /**
     * this method is for the life of user
     */public Vida getvidaBarra()
    {
        return vidaBarra;
    }
    
    /**
     * this method is for the life of enemy
     */public VidaEnemigoF getbarraEne()
    {
        return barraEne;
    }
    /**
     * Metodo para poder activar la musica del juego
     */
    public void play()
    {
        bgMusic.play();
    }
    
    /**
     * Metodo para deterner el sonido que actua en el juego
     */
    public void stop()
    {
        bgMusic.stop();
    }
    
    public void loop()
    {
        bgMusic.playLoop();
    }
    
       /**
     * Metodo en el cual se activa y pone todo lo necesario para poner  
     * en marche el juego en el primer escenario
     */
    public void prepare()
    {
      ///////////////vida para el jugador/////////////
      setBackground ("ecenario1.png");
      setPaintOrder(Vida.class);
      getBackground().scale(1000,600);
      addObject(vidaBarra,825,25);
      /////////////vida para el enemigo final//////////////
      setPaintOrder(VidaEnemigoF.class);
      getBackground().scale(1000,600);
      addObject(barraEne,280,25);
      
      addObject(punto, 500, 27);
    
      Barco1user bar = new Barco1user();
      addObject(bar,800,500);
    
      vScroll = 0;
    }
    
    /**
     * this method is for the prepare the enemys for the user
     */public void Prepare1()
    {
      EnemCriatura enecri = new EnemCriatura();
      EnemCriatura enec = new EnemCriatura();
      addObject(enecri,100,520);
      addObject(enec,100,410);
    }
    
    /**
     * this method is for create the enemys
     */public void creaEne()
    {
      Enemigo1 ene1 = new Enemigo1();
      addObject(ene1,100,440);
     }
    
    /**
     * this method is for the increase points
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

