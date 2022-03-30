import java.util.Random;

public class Engine {

    private static final int scorePoints2Max = 20;
    private static final int scorePoints2Min = 1;

    public static int scoredPoints(){
        Random random = new Random();
        if(random.nextInt(scorePoints2Max-scorePoints2Min) + Player.getShooting() >= 20) return 2;

        return 0;
    }

}
