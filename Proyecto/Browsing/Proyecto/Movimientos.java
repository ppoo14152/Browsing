import greenfoot.*;

/**
 * clase en la que los movimientos se podran hacer, ademas de las cordenadas
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 16 de abril del 2015
 */
public class Movimientos extends Actor
{
   private int damage;
   private double exactX;
   private double exactY;
    /**
     * Metodo para el movimiento de el jugador y anemigos
     */public void move(int distance)
    {
        move((double)distance);
    }
    
    /**
     * Metodo para el movimiento de el jugador y anemigos
     */public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }
    
    /**
     * Metodo para ver la posicion con cirdenadas x y
     */public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
    /**
     *Metodo para ver la posicion con cirdenadas x y 
     */
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     *Metodo para la posicion exacta de x 
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Metodo que regresa la posicion exacta en y
     */
    public double getExactY() 
    {
        return exactY;
    }
    
    /**
     * 
     */
    public int getDamage()
    {
        return damage;
    }
    
}
