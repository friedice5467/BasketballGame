import java.util.Random;

public class Player {
    private static String firstName = "";
    private static String lastName = "";
    private static int shooting;
    private int teamNumber;


    public Player(String firstName, String lastName, int teamNumber) {
        Player.firstName = firstName;
        Player.lastName = lastName;
        this.teamNumber = teamNumber;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public static int getShooting() {
        return shooting;
    }

    public static void populateStats(int num){
        int counter = 0;
        int sum = 0;
        Random random = new Random();
        //unweighted, so stats are pretty random/unbalanced
        do {

            int decrement = (random.nextInt(num - 1) + 1);
            sum += decrement;

            if (counter == 1) counter = 0;
            if (counter == 0) shooting += decrement;

            num -= decrement;
            counter++;

        } while (sum <= num);

    }

}
