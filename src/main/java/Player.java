import java.util.Random;

public class Player {
    private static final String firstName = "";
    private static final String lastName = "";
    private static int shooting;


    public Player(int shooting) {
        Player.shooting = shooting;
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


            int decrement = (random.nextInt(num - 1) + 1)/4;
            sum += decrement;

            if (counter == 1) counter = 0;
            if (counter == 0) shooting += decrement;



            num -= decrement;
            counter++;

        } while (sum <= num);

    }

}
