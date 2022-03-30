import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInput.createPlayer(scanner);
        System.out.println(Engine.scoredPoints());

    }

}
