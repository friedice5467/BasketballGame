import java.util.Scanner;

public class UserInput {

    public static void createPlayer(Scanner scanner){
        System.out.print("How strong start?");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        Player.populateStats(num);
    }

}
