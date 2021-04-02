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
    private GreenfootImage Game= new GreenfootImage("gameover.png");
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
        endgame();
       
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
            lives = lives - 1;
            Greenfoot.playSound("hurt.wav");
            setLocation( 10, 30);
            score();
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            lives = lives - 1;         
            Greenfoot.playSound("hurt.wav");
            setLocation( 10, 30);
            score();
          
        }
    }
    public void detectHome()
    {
        if (isTouching(House.class))
        {
            setLocation( 10, 30);
            Greenfoot.playSound("yipee.wav");
            score = score + 1;
            score();
            if( pizzaEaten == 5)
            {
                pizzaEaten = 0;
                Greenfoot.stop();
            }
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
            score();
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
    public void endgame()
    {
       if (lives == 0)
       {
           setImage(Game);
           Greenfoot.stop();
        }
    }
    public void score()
    {
        getWorld().showText("lives : "+lives, 723,540);
        getWorld().showText("Pizzas : "+pizzaEaten, 723,560);
    }
    
}
