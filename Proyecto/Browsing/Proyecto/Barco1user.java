import greenfoot.*;
/**
 * Write a description of class barco1 here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar
 * @version 15 de abril del 2015
 * @version 22 de abril del 2015 //agregar sonido de disparo
 */
public class Barco1user extends Movimientos
{
    private int q=0;
    private Cadenas vid;
    private Cadenas vidEne;
    private SimpleTimer timer;
    private Save jugador=new Save();
    private int puntos=0;
    
    private int vida = 200;
    /**
     * Act - do whatever the barco1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        Movimientos();
        MuestraVida();
        MuestraVidaEne();
        
    }    
    public Barco1user()
    {
     vid = new Cadenas("Vida ");
     vidEne = new Cadenas("Enemigo ");
     
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
           Disparo dis = new Disparo();
          
           getWorld().addObject(dis, getX(), getY()+10);
           
           dis.turn(getRotation());
              
           Greenfoot.playSound("kri-fire.wav");
        }
        
        if(isTouching(EnemCriatura.class))
        {
            //((Escenario1)getWorld()).gameOver();
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX(), getY());
            getWorld().removeObject(this);
        }
    
    }
    
    public void danio()
    {
     World miMundo = getWorld();
     Escenario1 escenario = (Escenario1)miMundo;
     Vida vidaBarra = escenario.getvidaBarra();
     if(isTouching(DisparoCri.class))
     {
         vida--;
         vidaBarra.detectaPresen();
         Fuego fuego = new Fuego();
         getWorld().addObject(fuego, getX(), getY());
     }
     
     if(vida == 0)
     {
       jugador.saveHighscore(puntos);
       Greenfoot.setWorld(new Fin(1));
      }
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
    
}