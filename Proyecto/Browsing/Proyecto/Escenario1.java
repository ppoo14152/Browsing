import greenfoot.*;

/**
 * Write a description of class Escenario1 here.
 * 
 * @author zarazua lopez vicente
 * @author Efraín Jacobo Tovar 
 * @version 13 de abril del 2015
 * @version ultima modificacion 21 de abril del 2015
 */

public class Escenario1 extends World
{
    private int timeSpawn = 0;
    Puntos punto = new Puntos("Puntos : ");
    GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    public ImgScroll scroll;
  
    public void act()
    {
        timeSpawn++;
        if(timeSpawn>700){
            timeSpawn = 0;
            createEnemCriatura();
        }
    }
    
    /**
     * Constructor del escenario1
     * 
     */
    public Escenario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1,false); 
       
       scroll = new ImgScroll(this,new GreenfootImage("ecenario1.png"),1700,1500);
       /**for(int j=0; j<scroll.getScrollHeight()-100; j+=300)
       {
         for(int i=0; i<scroll.getScrollWidth()-200;i+=300)
         {
          }
        }*/
        prepare();
        play();
        loop();
    }
    
    public void play()
    {
        bgMusic.play();
    }
    
    public void stop()
    {
        bgMusic.stop();
    }
    
    public void loop()
    {
        bgMusic.playLoop();
    }
    
    public void createEnemCriatura()
    {
        EnemCriatura ene = new EnemCriatura();
        addObject(ene, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(300));
        ene.turn(Greenfoot.getRandomNumber(100));
    }
    
    private void prepare()
    {
      addObject(punto, 500, 27);
      EnemCriatura enecri = new EnemCriatura();
      addObject(enecri,100,200);
      //for(int i = 0 ; i<2; i++)
      //{
          createEnemCriatura();
        //}
      Barco1user bar = new Barco1user();
      addObject(bar,800,500);
      //bar.setLocation(293,366);
    }
    
     public void tambahSkor()
    {
        punto.add(50);
    }
}
