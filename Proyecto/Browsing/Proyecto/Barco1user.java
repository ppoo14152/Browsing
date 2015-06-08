import greenfoot.*;
/**
 * Clase del Barco1user en el cual sera el usuario el que lo manipulara
 * el cual con sus acciones se llevaraacabo el juego
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar
 * @version 15 de abril del 2015
 * @version 22 de abril del 2015 //agregar sonido de disparo
 */
 public class Barco1user extends Movimientos
 {
  private Cadenas vid;
  private Save jugador=new Save();
  private Vida vidaBarra = new Vida();
  private int vida = 300;
  private VidaEnemigoF barraEne = new VidaEnemigoF();
  private int vidaE = 100;
  private GreenfootSound s;
  
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
   
    
  /**
   * Constructor del Barco1user
   */
  public Barco1user()
    {
     vid = new Cadenas("Vida ");
     //vidEne = new Cadenas("Enemigo ");
      
    }
    
  /**
   * Metodo para activar los movimientos del barco
   */public void Movimientos()
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
   *Metodo para poder disparar  
   */
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
  
  /**
   *Metodo para regresar la vida del jugador 
   */
  public int getVida()
    {
        return vida;
    }
 
  /**
   * Metodo para regresar la vida del enemigo
   */public int getVidaE()
    {
        return vidaE;
    }
    
  /**
   * Metodo para ver lo que le pasan a el barco1user
   */
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
      
       /*if(getOneIntersectingObject(MasVida.class)!=null)
        {
         vida+=10;
         vidaBarra.detectaPresen();
         s= new GreenfootSound("ok.mp3");
         s.play();
         getWorld().removeObject(getOneIntersectingObject(MasVida.class));
       }*/
        
      
       if(((Escenario1)getWorld()).punto.getValue()==50)
       {
         ((Escenario1)getWorld()).creaEne();  
         //Enemigo1 ene1 = new Enemigo1();
         //((Escenario1)getWorld()).addObject(ene1,100,440);
         
        }
        
       if(((Escenario1)getWorld()).punto.getValue()==110 || ((Escenario1)getWorld()).punto.getValue()==700)
       {
         //((Escenario1)getWorld()).Gas();  
          MasVida mivi= new MasVida();
         ((Escenario1)getWorld()).addObject(mivi,180,500);
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
   
   /**
    *Metodo que muestra el nombre del jugador  
    */
   public void MuestraVida()
    {
        vid.despliegaTex("",30);
        getWorld().addObject(vid,645,25);
    }

  }