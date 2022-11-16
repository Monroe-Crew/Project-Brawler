import greenfoot.*; 
public class StartScreen extends World
{
    boolean start = false;
    static GreenfootSound titleMusic = new GreenfootSound("StartScreen.mp3");
    static public Music music = new Music();
    public StartScreen(){    

        super(Constants.Settings.worldWidth, Constants.Settings.worldHeight, 1);
        prepare();
    }

    private void prepare(){
        StartButton startButton = new StartButton();
        addObject(startButton,598,589);
        Title title = new Title();
        addObject(title,625,707);
    }

    public void act(){
        if(!start){
            music.addSound(titleMusic);
        }
        start=true;
    }
}
