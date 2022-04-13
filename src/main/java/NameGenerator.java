import org.apache.commons.lang3.ArrayUtils;

public class NameGenerator {
    private static String[] playerName = new String[]{"Alexander Simon", "Oliver Clarke", "Pat Jenson", "Martin Evans", " Tony Brewer", "Dave McLaughin", "Johnathan Thompson", "Moses Bryant", "Cecil Vaughn", "Frank Saunders"};
    private static String[] teamName = new String[]{"Quicksilver Falcons", "Knockout Stars", "Black & White Rockets", "Tornado Legends", "Scorpion Rebels", "American Dragons", "Xtreme Monsters", "Dolphin Spanners", "Striking Crunchers", "Silver Geckos"};

    public String[] getPlayerName() {
        return playerName;
    }

    public String[] getTeamName() {
        return teamName;
    }

    public static String pickRandomPlayerName(){
        String randomName = playerName[(int) (Math.random() * playerName.length)];

        for (int i = 0; i < playerName.length ; i++) {
            if(playerName[i].equals(randomName))playerName = ArrayUtils.remove(playerName, i);
        }

        return randomName;
    }

    public static String pickRandomTeamName(){
        String randomName = teamName[(int) (Math.random() * teamName.length)];

        for (int i = 0; i < teamName.length ; i++) {
            if(teamName[i].equals(randomName))teamName = ArrayUtils.remove(teamName, i);
        }

        return randomName;
    }
}
