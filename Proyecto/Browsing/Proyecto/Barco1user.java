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
  private Save jugador=new Save();
  Vida vidaBarra = new Vida();
  private int vida = 300;
  VidaEnemigoF barraEne = new VidaEnemigoF();
  private int vidaE = 100;
  /**
     * Act - do whatever the barco1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movimientos();
        MuestraVida();
        danio(); 
    }
   
    
    public Barco1user()
    {
     vid = new Cadenas("Vida ");
     //vidEne = new Cadenas("Enemigo ");
      
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
       Escenario1 escenario = (Escenario1)miMundo;
       Vida vidaBarra = escenario.getvidaBarra();
       
       if(isTouching(DisparoCri.class) || isTouching(Bala1.class))
        {   
         vida--;
         vidaBarra.detectaPresen();
         Fuego fuego = new Fuego();
         getWorld().addObject(fuego, getX(), getY());
       }   
       else
       if(isTouching(EnemCriatura.class) ||isTouching(Enemigo1.class))
       {
        vida--;
        vidaBarra.detectaPresen();
        Fuego fuego = new Fuego();
        getWorld().addObject(fuego, getX(), getY());
      
       }
      
       if(((Escenario1)getWorld()).punto.getValue()==50)
       {
         ((Escenario1)getWorld()).creaEne();  
         //Enemigo1 ene1 = new Enemigo1();
         //((Escenario1)getWorld()).addObject(ene1,100,440);
        }
        
       if(getVida() == 0)
       {
        jugador.saveHighscore(((Escenario1)getWorld()).punto.getValue());
        //capturaPuntaje();
        Greenfoot.setWorld(new Fin(1));
        ((Escenario1)getWorld()).stop();
       }
       else
       if(((Escenario1)getWorld()).punto.getValue()==1060)
       {
          jugador.saveHighscore(((Escenario1)getWorld()).punto.getValue());
           Greenfoot.setWorld(new Fin(0));
        ((Escenario1)getWorld()).stop();
       }
       
     }
     
   /**
    * This method save the records of the user.
    *
    */
    public void capturaPuntaje()
    {
         if (UserInfo.isStorageAvailable()) 
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            if (((Escenario1)getWorld()).punto.getValue() > myInfo.getScore()) 
            {
                myInfo.setScore(((Escenario1)getWorld()).punto.getValue());
                myInfo.store();  
            }
        }  
    }
   
   public void MuestraVida()
    {
        vid.despliegaTex("",30);
        getWorld().addObject(vid,645,25);
    }

  }