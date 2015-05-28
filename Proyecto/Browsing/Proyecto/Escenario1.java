
import greenfoot.*;

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
    Puntos punto = new Puntos("Puntos : ");
    GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    public ImgScroll scroll;
    private int vScroll;
    Vida vidaBarra = new Vida();
    VidaEnemigoF barraEne = new VidaEnemigoF(); 
   
    
    public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
            createEnemCriatura();
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
     * Metodo para crear la criatura uno para el primer nivel
     */
    public void createEnemCriatura()
    {
        EnemCriatura ene = new EnemCriatura();
        //addObject(ene, Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(75));
        //ene.turn(Greenfoot.getRandomNumber(100));
    }
    
    /**
     * Metodo en el cual se activa y pone todo lo necesario para poner  
     * en marche el juego en el primer escenario
     */
    private void prepare()
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
      EnemCriatura enecri = new EnemCriatura();
      EnemCriatura enec = new EnemCriatura();
      addObject(enecri,100,520);
      addObject(enec,100,410);
      //for(int i = 0 ; i<2; i++)
      //{
          createEnemCriatura();
        //}
      Barco1user bar = new Barco1user();
      addObject(bar,800,500);
    
      //addOjectt((String)("Vida: "),810,25);
      //bar.setLocation(293,366);
      vScroll = 0;
    }
    
    /**
     * Metodo para la puntuacion
     */
     public void tambahSkor()
    {
        punto.add(50);
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

