package CampusChaos;
import java.util.Random;
public class Dice {
    private Random random;
    public Dice(){
        random = new Random();
    }
    public static void dice_roll(){System.out.println(random.nextInt(6) + 1);
    }

}
