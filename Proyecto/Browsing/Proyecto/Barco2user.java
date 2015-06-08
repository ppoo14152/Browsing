import greenfoot.*;

/**
 * clase para el jugador en el nivel medio el cual realizara
 * diferentes acciones al el barco 1
 * @author zarazua lopez vicente
 * @author jacobotovar efrain
 * @version 28 de abril del 2015
 * 
 */
public class Barco2user extends Movimientos
{
    private Cadenas vid;
    private Cadenas vidEne;
    private Cadenas nivel;
    private Cadenas pun;
    private Save jugador=new Save();
    private Counter score;
    private int vida = 300;
    private VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    private GreenfootSound s;
    /**
     * Act - do whatever the Barco2user wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
       Movimientos(); 
       MuestraVida();
       MuestraVidaEne();
       MuestraNivel();
       danio();
        
    }    
    
    /** 
     *Metodo para poder mover el barco en diferentes direcciones 
     */
    public void Movimientos()
    {
         //mueve a el barco para la derecha
        if(Greenfoot.isKeyDown("right")){
            move(3);
           }
            //mueve a el barco para la izquierda
        else if(Greenfoot.isKeyDown("left")){
            move(-4);
        }
        
        //mover para arriba a el barco del usuario
        if(Greenfoot.isKeyDown("up"))
            turn(1);
            //mover el barco del usuario a hacia abajo            
        else if(Greenfoot.isKeyDown("down"))
            turn(-1);
         
        Disparar();
    }
    
    /**
     * Metodo para que el barco 2 dispare
     */
    public void Disparar()
    {
        if(("space").equals(Greenfoot.getKey()))
        {
           Disparo2 disp = new Disparo2();
          
           getWorld().addObject(disp, getX(), getY());
           
           disp.turn(getRotation());
           
           Greenfoot.playSound("kri-fire.wav");
        }
    }
    
    /**
     * constructor del barco2user 
     */
    public Barco2user()
    {
     vid = new Cadenas("Vida ");
     vidEne = new Cadenas("Enemigo ");
     nivel= new Cadenas("Nivel Medio");
    }
    
    /**
     *metodo para regresar la vida del jugador 
     */  
    public int getVida()
    {
        return vida;
    }
    
    /**
     * metodo para mostrar en el escenario el texto "vida"
     */
    public void MuestraVida()
    {
        vid.despliegaTex("",30);
        getWorld().addObject(vid,645,25);
    }

    /**
     *Metodo para desplegar en el escenario el texto "Enemigo" 
     */
    public void MuestraVidaEne()
    {
        vidEne.despliegaTex("",30);
        getWorld().addObject(vidEne,75,25);
    }
    
    
     /**Metodo que despilega la informacion de en 
     * que nivel se esta jugando 
     */
    public void MuestraNivel()
    {
         nivel.despliegaTex("",30);
        getWorld().addObject(nivel,510,67);
    }
         
    /**
     *Metodo para ver el daño que le pasara a el jugador 
     *ademas de lo que sucedera si gana o pierde
     */
    public void danio()
    {
     World miMundo = getWorld();
     Escenario2 escenario2 = (Escenario2)miMundo;
     Vida vidaBarra = escenario2.getvidaBarra();
     if(isTouching(Rocas.class)|| isTouching(Bala2.class))
       {
         vida-=20;
         vidaBarra.detectaPresen();
         Fuego fuego = new Fuego();
         getWorld().addObject(fuego, getX(), getY());
     }
     else
     if(isTouching(EnemCriatura2.class) ||isTouching(Enemigo2.class))
      {
       vida-=20;
       vidaBarra.detectaPresen();
       Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY());
       }
       
     if(((Escenario2)getWorld()).punto.getValue()==100)
       {
         ((Escenario2)getWorld()).creaEne2();
         ((Escenario2)getWorld()).Gas();  

        }
        
     if(getVida() == 0)
     {
       jugador.saveHighscore(((Escenario2)getWorld()).punto.getValue());
       Greenfoot.setWorld(new Fin(1));
       ((Escenario2)getWorld()).stop();
     }
     else
       if(((Escenario2)getWorld()).punto.getValue()==1630)
       {
          jugador.saveHighscore(((Escenario2)getWorld()).punto.getValue());
           Greenfoot.setWorld(new Fin(0));
        ((Escenario2)getWorld()).stop();
       }
       else
        if(getOneIntersectingObject(MasVida.class)!=null)
        {
         vida+=40;
         vidaBarra.sumavida();
         s= new GreenfootSound("ok.mp3");
         s.play();
        getWorld().removeObject(getOneIntersectingObject(MasVida.class));
       }
    }
    
}
