import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int team1Score = 0;
    private  static int team2Score = 0;


    public static void main(String[] args) {
        UserInput.createPlayer(scanner);
        while(Engine.isIsGameStart()){
            if(Engine.isTeam1()) team1Score += Engine.takeShot();
//            else team2Score += Engine.takeShot();
            System.out.println("Team1 Score: " + team1Score);
            System.out.println("-----------");
            Engine.checkGameStatus();
        }


    }

}
