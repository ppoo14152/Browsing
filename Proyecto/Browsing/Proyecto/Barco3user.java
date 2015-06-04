import greenfoot.*;

/**
 * Write a description of class Barco3user here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * 
 * clase para el barco del usuario en el nivel 3
 */
public class Barco3user extends Movimientos
{
    private int count=0;
    private int q=0;
    private Cadenas vid;
    private Cadenas vidEne;
    private Save jugador=new Save();
    Vida vidaBarra = new Vida();
    private int vida = 300;
    VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    /**
     * Act - do whatever the Barco3user wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //if(count==0)
        //{
          //  setRotation(0);
        //}
        //if(count <= 2)
        //{
          //  count++;
        //}
        movimientos();
        MuestraVida();
        MuestraVidaEne();
        disparar();
        danio();
    }
    
      public Barco3user()
    {
     vid = new Cadenas("Vida ");
     vidEne = new Cadenas("Enemigo ");
       
    }
    
    private void movimientos()
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
    if(Greenfoot.isKeyDown("up")){
            turn(1);
        }
            //mover el barco del usuario a hacia abajo            
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-1);
        }
        }
        
    private void disparar()
    {
        if(("space").equals(Greenfoot.getKey()))
        //if (Greenfoot.isKeyDown("space"))//&& System.currentTimeMillis()>lastShot+300)
        {
           Disparo3 di = new Disparo3();
          
           getWorld().addObject(di, getX(), getY());
           
           di.turn(getRotation());

           Greenfoot.playSound("kri-fire.wav");
        }
    }
    
     public int getVida()
    {
        return vida;
    }
    
     public int getVidaE()
    {
        return vidaE;
    }
    
     public void danio()
    {
     World miMundo = getWorld();
     Escenario3 escenario3 = (Escenario3)miMundo;
     Vida vidaBarra = escenario3.getvidaBarra();
     //((Escenario1)getWorld()).tambahSkor();
     if(isTouching(Llamas.class) || isTouching(Bala3.class))
     {
         vida--;
         vidaBarra.detectaPresen();
         Fuego fuego = new Fuego();
         getWorld().addObject(fuego, getX(), getY());
     }
     if(isTouching(EnemCriatura3.class)||isTouching(Enemigo3.class))
     {
      vida--;
      vidaBarra.detectaPresen();
      Fuego fuego = new Fuego();
      getWorld().addObject(fuego, getX(), getY());
     }
     if(((Escenario3)getWorld()).punto.getValue()==150)
       {
         ((Escenario3)getWorld()).creaEne3();  
         //Enemigo3 ene3 = new Enemigo3();
         //((Escenario3)getWorld()).addObject(ene1,100,440);
        }
     if(vida == 0)
     {
      jugador.saveHighscore(((Escenario3)getWorld()).punto.getValue());
      Greenfoot.setWorld(new Fin(1));
      ((Escenario3)getWorld()).stop();
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
