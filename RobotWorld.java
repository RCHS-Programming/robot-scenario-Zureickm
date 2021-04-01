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
        addObject( new Robot(), 10, 30);
        addObject( new Wall(),50 , 160);
        addObject( new Wall(),150, 160);
        addObject( new Wall(),250, 160);
        addObject( new Wall(),300, 160);
        addObject( new Wall(),750, 160);
        addObject( new Wall(),650, 160);
        addObject( new Block(),475,160);
        addObject( new House(),40, 560);
        addObject( new ScorePanel(),720, 560);
        addObject( new Pizza(),750, 60);
        addObject( new Pizza(),150, 300);
        addObject( new Pizza(),700, 260);
        addObject( new Pizza(),400, 30);
        addObject( new Pizza(),550, 500);
            
    }
    
}
