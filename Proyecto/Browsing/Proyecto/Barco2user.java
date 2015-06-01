import greenfoot.*;

/**
 * Write a description of class Barco2user here.
 * 
 * @author zarazua lopez vicente
 * @author jacobotovar efrain
 * @version 28 de abril del 2015
 * 
 * clase para el jugador en el nivel medio
 */
public class Barco2user extends Movimientos
{
     private int q=0;
    private Cadenas vid;
    private Cadenas vidEne;
    private Cadenas pun;

    private Save jugador=new Save();
    private Counter score;
   
    private int puntos=200;
    private int vida = 200;
    
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
       danio();
        
    }    
    
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
    
    public Barco2user()
    {
     vid = new Cadenas("Vida ");
     vidEne = new Cadenas("Enemigo ");
    }
    
    public void MuestraVida()
    {
        vid.despliegaTex("",30);
        getWorld().addObject(vid,645,25);
    }

     public void MuestraVidaEne()
    {
        vidEne.despliegaTex("",30);
        getWorld().addObject(vidEne,75,25);
    }
    
     public void MuestraPuntos()
    {
        pun.despliegaTex(""+puntos,30);
        getWorld().addObject(pun,500,100);
    }
    
    public void danio()
    {
     World miMundo = getWorld();
     Escenario2 escenario2 = (Escenario2)miMundo;
     Vida vidaBarra = escenario2.getvidaBarra();
     //((Escenario1)getWorld()).tambahSkor();
     if(isTouching(Rocas.class))
     {
         vida--;
         vidaBarra.detectaPresen();
         Fuego fuego = new Fuego();
         getWorld().addObject(fuego, getX(), getY());
     }
     
     if(isTouching(EnemCriatura2.class))
     {
      vida-=10;
      vidaBarra.detectaPresen();
      Fuego fuego = new Fuego();
      getWorld().addObject(fuego, getX(), getY());
     }
     
     
     if(vida == 0)
     {
       jugador.saveHighscore(puntos);
       Greenfoot.setWorld(new Fin(1));
       ((Escenario2)getWorld()).stop();
      }
    }
    
}
