import greenfoot.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

/**
 * clase Escenario1 es donde se desarrolla el juego para el primer nivel 
 * el cual consta de diferentes acciones
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 13 de abril del 2015
 * @version ultima modificacion 21 de abril del 2015
 */

public class Escenario1 extends World
{
   private int timeSpawn = 0;
   private Barco1user bar1;
   Counter punto = new Counter("Puntos : ");
   private GreenfootSound bgMusic = new GreenfootSound("bg.wav");
   private ImgScroll scroll;
   private int vScroll;
   private Vida vidaBarra = new Vida();
   private VidaEnemigoF barraEne = new VidaEnemigoF();
   /**
    * Metodo para actuar de el escenario 1
    */public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
        }
        scrollWorld();
        Counter punto = new Counter("Puntos : ");
       
    }
    
   /**
     * Constructor del escenario1
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
     * metodo para ir checando la vida del jugador
     */public Vida getvidaBarra()
    {
        return vidaBarra;
    }
    
    /**
     * metodo para ir checando la vida del enemigo
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
      Gas();
      vScroll = 0;
      
    }
    
    /**
     *Metodo para crear la imagen que servira
     *como referencia para recuperar la vida
     */
    public void Gas()
    {
        
      MasVida mivi= new MasVida();
      addObject(mivi,180,500);
   
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
    *Metodo para regresar la informacion del barco de 
    *usuario asi de como su estado
    */
   public Barco1user getBarco1user()
   {
       return bar1;
    }

    /**
     * para incrementr la suma a la velocidad de vScroll.
     */
    public void setVScroll(int increment)
    {
        vScroll+=increment;
    }
    
}

