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
public class Meteoro extends Movimientos
{
  private Vida vidaBarra = new Vida();
  private int vida = 300;
  
    public void act()
    {
       World m=getWorld();
     Escenario1 escenario1 = (Escenario1)m;
     Vida vidaBarra = escenario1.getvidaBarra();
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
         
        if(isTouching(Barco1user.class))
      {
        vida-=20;
        vidaBarra.detectaPresen();
       Greenfoot.playSound("meteoro.mp3");
        Fuego fuego = new Fuego();
       getWorld().addObject(fuego, getX(), getY()); 
       getWorld().removeObject(this);
      }
      else
       if(isTouching(Disparo.class))
         {
            Fuego fuego = new Fuego();
            Greenfoot.playSound("meteoro.mp3");
            getWorld().addObject(fuego, getX(), getY()); 
            getWorld().removeObject(this);
          }
          
    
   }
    
   
 }    
   