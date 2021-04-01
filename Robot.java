import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int lives = 3;
    private int score = 0;
    private int pizzaEaten = 0;
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        eatPizza();
        detectHome();
       
    }    
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3 );
            Animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
          setLocation( getX(), getY() + 3); 
          Animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
          setLocation( getX()-3, getY()); 
          Animate();
        }
        if (Greenfoot.isKeyDown("Right"))
        {
          setLocation( getX()+3, getY()); 
          Animate();
        }
        
    }
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            Greenfoot.stop();
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            Greenfoot.stop();           
            Greenfoot.playSound("hurt.wav");
          
        }
    }
    public void detectHome()
    {
        if (isTouching(House.class))
        {
            setLocation( 10, 30);
            Greenfoot.playSound("yipee.wav");
            pizzaEaten = 0;
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
        }
    }
    public void Animate()
    {
         if(getImage()==robotimage1)
       { 
           setImage(robotimage2);
           
       }
       else
       {
           setImage(robotimage1);
        }   
    }
    
}
