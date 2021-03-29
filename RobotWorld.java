import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (MATTHEW ZUREICK) 
 * @version (3/29/21)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
       super(800, 600, 1); 
        addObject( new Robot(),10,30);
        addObject( new Wall(),0, 200);
        addObject( new Wall(),40,200);
    }
}
