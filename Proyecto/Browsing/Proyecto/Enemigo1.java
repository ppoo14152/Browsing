import greenfoot.*; 

/**
 * clase para el enemigo 1 que saldra para terminar el nivel 1
 * 
 * @author zarazua lopez vicente
 * @author jacobo tovar efrain
 * @version 28 de abril del 2015
 * 
 */
public class Enemigo1 extends Movimientos
{
    private int disparo=0;
    private Cadenas vidEne;
    private Save jugador=new Save();
    private VidaEnemigoF barraEne = new VidaEnemigoF();
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
        if(isTouching(Barco1user.class))
         {
            Fuego fuego = new Fuego();
            getWorld().addObject(fuego, getX()+10, getY());
        }
        
    }
    
    /**
     *Constructor del enemigo1 
     */
    public Enemigo1()
    {
        vidEne = new Cadenas("Enemigo ");
     }
    
    /**
     *Metodo para el disparo para el enemigo final 1 
     */
    public void disparo()
    {
        disparo++;
         if(disparo==1)
        {
         
         Bala1 b1 = new Bala1();
         getWorld().addObject(b1,getX(),getY());
         b1.setRotation(getRotation());
        }
        if(disparo==50)
        {
         disparo=0;
        }   
    } 
       
     /**
      *Metodo que despliega el texto "Enemigo" 
      */
     public void MuestraVidaEne()
    {
        vidEne.despliegaTex("",30);
        getWorld().addObject(vidEne,75,25);
    }
    
    
}
