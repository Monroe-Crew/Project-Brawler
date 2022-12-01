import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;  

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
  static GreenfootSound endMusic1 = new GreenfootSound("EndScreen1.mp3");
  static GreenfootSound endMusic2 = new GreenfootSound("EndScreen2.mp3");
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        super(Constants.Settings.worldWidth, Constants.Settings.worldHeight, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        EndScreen_Leaderboard endScreen_Leaderboard = new EndScreen_Leaderboard();
        addObject(endScreen_Leaderboard,Constants.Settings.worldWidth/2,Constants.Settings.worldHeight/2);
    }
}
