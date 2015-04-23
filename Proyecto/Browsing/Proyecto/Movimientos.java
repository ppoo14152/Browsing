import greenfoot.*;

/**
 * Write a description of class Movimientos here.
 * clase en la que los movimientos se podran hacer, ademas de las cordenadas
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 16 de abril del 2015
 */
public class Movimientos extends Actor
{
    private double exactX;
    private double exactY;
   
    public void move(int distance)
    {
        move((double)distance);
    }
    
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }
    
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    public double getExactX() 
    {
        return exactX;
    }

    public double getExactY() 
    {
        return exactY;
    }
}
