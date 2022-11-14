public class Constants  
{
    public static final class Settings{
        public static final boolean debugMode = false;
        public static final int worldWidth = 1280;
        public static final int worldHeight = 960;
    }
    
    public static final class Animal{
        public static final double pushCooldown = .5;
        public static final double movementResponsiveness = .7;
    }
    
    public static final class Chicken{
        public static final int weight = 1;
        public static final double specialCooldown = .5;
    }
    
    public static final class Pig{
        public static final int weight = 2;
        public static final double slideLength = 3;
        public static final double specialCooldown = 5; // Includes slide length
    }
}