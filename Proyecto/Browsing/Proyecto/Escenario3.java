import greenfoot.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

/**
 *clase para la dificultad dificil, el  Escenario3 es el ultimo nivel del juego en el cual 
 *sera diferente al los demas
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 27 de abril del 2015
 * @version ultima modificacion 28 de abril del 2015
 * 
 */
public class Escenario3 extends World
{
    private int timeSpawn = 0;
    Counter punto = new Counter("Puntos : ");
    private GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    private int vScroll;
    private ImgScroll scroll;
    private Vida vidaBarra = new Vida();
    private VidaEnemigoF barraEne = new VidaEnemigoF();
    /**
     * Constructor para el  Escenario3.
     * 
     */
    public Escenario3()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
       setBackground ("escenario.png");
       getBackground().setColor(Color.BLACK);
       getBackground().fill();
        prepare();
        prepare1();
        play();
        loop();
        
    }
    
    /**
     *Metodo de actuar de el escenario3 
     */
    public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
        }   
       scrollWorld();
   
    }
    
    /**
     *Metodo para iniciar la musica 
     */
    public void play()
    {
        bgMusic.play();
    }
    
    /**
     *Metodo para detener la musica 
     */
    public void stop()
    {
        bgMusic.stop();
    }
    
    /**
     *Metodo para repetir la musica varias veces(ciclo) 
     */
    public void loop()
    {
        bgMusic.playLoop();
    }
    
    /**
     * Metodo para agregar los elementos a el escenario
     */
    public void prepare()
    {
      setBackground ("escenario.png");
      setPaintOrder(Vida.class);
      getBackground().scale(1000,600);
      addObject(vidaBarra,825,25);
      
       /////////////vida para el enemigo final//////////////
      setPaintOrder(VidaEnemigoF.class);
      getBackground().scale(1000,600);
      addObject(barraEne,280,25);
      
      addObject(punto, 500, 27);
      
      Barco3user bar3 = new Barco3user();
      addObject(bar3,800,500);
       vScroll = 0;
        Gas();
       crearMeteoro3(6);
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
     * Metodo para crear mas obstaculos para el juego
     * que se moveran por el escenario
     */ 
    public void crearMeteoro3(int numero)
    {
    for(int i=0;i<numero;i++)
    {
    Meteoro3 me3 = new Meteoro3(); 
    int x=Greenfoot.getRandomNumber(getWidth());
    int y=Greenfoot.getRandomNumber(getWidth());
    addObject(me3,x,y);
    }
    }
    
    /**
     * Metodo para crea a las criaturas, ademas de añadirlas a el escenario
     */
    public void prepare1()
     {
      EnemCriatura3 enecri = new EnemCriatura3();
      EnemCriatura3 enec = new EnemCriatura3();
      addObject(enecri,100,500);
      addObject(enec,100,300);
      
     }
    
    /**
     *Metodo para crear a el enemigo final de el nivel 3
     */
    public void creaEne3()
    {
      Enemigo3 ene3 = new Enemigo3();
      addObject(ene3,100,440);
     }
     
     /**
      * Metodo para ir verificando la vida del jugador
      */ 
     public Vida getvidaBarra()
    {
        return vidaBarra;
    }
    
    /**
     *Metodo para ir verificando la vida del enemigo 
     */
    public VidaEnemigoF getbarraEne()
    {
        return barraEne;
    }
    
    /**
     * Metodo para acumular los puntos segun la 
     * cantidad dada
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
