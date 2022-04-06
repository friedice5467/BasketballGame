import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrabFiles {

    public static List<Team> grabTeamFile() {
        String teamInput = "team.csv";
        File file = new File(teamInput);
        List<Team> teamList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");
                Team team;

                String teamName = columns[0].trim();
                String playerNumberStr = columns[1].trim();
                int playerNumberInt = Integer.parseInt(playerNumberStr);
                team = new Team(teamName, playerNumberInt);

                teamList.add(team);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return teamList;
    }
}
