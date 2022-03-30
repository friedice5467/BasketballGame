import java.util.Scanner;

public class UserInput {

    public static void createPlayer(Scanner scanner){
        System.out.print("How strong start? (for now 20) >>> ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        Player.populateStats(num);
//        System.out.println("Player shooting ability is: " + Player.getShooting());
    }

}
