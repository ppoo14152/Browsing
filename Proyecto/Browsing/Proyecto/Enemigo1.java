import greenfoot.*;

/**
 * Write a description of class Enemigo1 here.
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * 
 * clase para el enemigo 1 que saldra para terminar el nivel 1
 */
public class Enemigo1 extends Movimientos
{
    private int q=0;
    private Cadenas vidEne;
    private Save jugador=new Save();
    VidaEnemigoF barraEne = new VidaEnemigoF();
    private int vidaE = 100;
    /**
     * Act - do whatever the Enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        disparo();
        MuestraVidaEne();
        vidaFin();  
        if(isTouching(Barco1user.class))
         {
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
        }
        
    }
    
    public Enemigo1()
    {
        vidEne = new Cadenas("Enemigo ");
     }
    
    public void disparo()
    {
        q++;
         if(q==1)
        {
         
         Bala1 b1 = new Bala1();
         getWorld().addObject(b1,getX(),getY());
         b1.setRotation(getRotation());
        }
        if(q==50)
        {
         q=0;
        }   
    }
      
     public int getVidaE()
    {
        return vidaE;
    }
    
    public void vidaFin()
    {
      World miMundo = getWorld();
      Escenario1 escenario1 = (Escenario1)miMundo;
      VidaEnemigoF barraEne=escenario1.getbarraEne();
      if(getVidaE() == 0)
         {
         jugador.saveHighscore(((Escenario1)getWorld()).punto.getValue());
         //removeTouching(Enemigo1.class);
         Greenfoot.setWorld(new Fin(0));
         ((Escenario1)getWorld()).stop();
        }
    }
     public void MuestraVidaEne()
    {
        vidEne.despliegaTex("",30);
        getWorld().addObject(vidEne,75,25);
    }
    
    
}
