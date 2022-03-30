import java.util.Random;

public class Engine {

    private static final int minimumPtsToScore2 = 20;
    private static final int scorePoints2Max = 20;
    private static final int scorePoints2Min = 1;
    private static int possessionsPerGame = 10;
    private static boolean isGameStart = true;
    private static boolean team1 = true;


    public static int getPossessionsPerGame() {
        return possessionsPerGame;
    }

    public static boolean isTeam1() {
        return team1;
    }

    public static boolean isIsGameStart() {
        return isGameStart;
    }

    public static boolean checkGameStatus(){
        if(possessionsPerGame <= 0) return isGameStart = false;
        return isGameStart = true;
    }

    public static int takeShot(){
        Random random = new Random();
        System.out.println("check if " + (random.nextInt(scorePoints2Max-scorePoints2Min) + Player.getShooting()) + " is >= " + minimumPtsToScore2);
        if(random.nextInt(scorePoints2Max-scorePoints2Min) + Player.getShooting() >= minimumPtsToScore2){
            possessionsPerGame --;
            return 2;
        }
        possessionsPerGame --;
        return 0;
    }
}
