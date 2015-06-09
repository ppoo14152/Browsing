import greenfoot.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
/**
 * clase Meteoro es aquella que aparecera de manera aleatoria, 
 * este a la vez le restara vida a el jugador
 * @author (jacobo tovar efrain)
 * @author (zarazua lopez vicente)
 * @version (junio del 2015)
 */
public class Meteoro3 extends Movimientos
{
    
   private int vida = 300;
    public void act()
    {
       World m=getWorld();
     Escenario3 escenario3 = (Escenario3)m;
     Vida vidaBarra = escenario3.getvidaBarra();
         if(getX()<getWorld().getWidth())
        {
         move(2);
    
         if(getX()>=m.getWidth()-5||getX()<=5)
         {
         turn(180);
        
         if(Greenfoot.getRandomNumber(100)<90)
         {
          turn(Greenfoot.getRandomNumber(90-45));
         }
        }
        
        if(getY()>=m.getHeight()-5||getY()<=5)
        {
          turn(180);
         
        if(Greenfoot.getRandomNumber(100)<90)
          {
          turn(Greenfoot.getRandomNumber(90-45));
          }
        }
    }
       
    if(isTouching(Barco3user.class))
      {
        vida-=20;
        vidaBarra.detectaPresen();
       Fuego fuego = new Fuego();
        Greenfoot.playSound("meteoro.mp3");
       getWorld().addObject(fuego, getX(), getY()); 
       getWorld().removeObject(this);
      }
      else
       if(isTouching(Disparo3.class))
         {
            Fuego fuego = new Fuego();
             Greenfoot.playSound("meteoro.mp3");
            getWorld().addObject(fuego, getX(), getY()); 
            getWorld().removeObject(this);
          }
          
    
   }
    
 }