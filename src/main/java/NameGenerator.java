import org.apache.commons.lang3.ArrayUtils;

public class NameGenerator {
    private static String[] playerNameArr = new String[]{"Alexander Simon", "Oliver Clarke", "Pat Jenson", "Martin Evans", "Tony Brewer", "Dave McLaughin", "Johnathan Thompson", "Moses Bryant", "Cecil Vaughn", "Frank Saunders", "Derrick Rose", "Will Smith"};
    private static String[] teamNameArr = new String[]{"Quicksilver Falcons", "Knockout Stars", "Black & White Rockets", "Tornado Legends", "Scorpion Rebels", "American Dragons", "Xtreme Monsters", "Dolphin Spanners", "Striking Crunchers", "Silver Geckos"};

    public static String[] getPlayerNameArr() {
        return playerNameArr;
    }

    public static String[] getTeamNameArr() {
        return teamNameArr;
    }

    public static String pickRandomPlayerName(){
        String randomName = playerNameArr[(int) (Math.random() * playerNameArr.length)];

        for (int i = 0; i < playerNameArr.length ; i++) {// removes string from array after use, however function call happens too much
            if(playerNameArr[i].equals(randomName)){
                playerNameArr = ArrayUtils.remove(playerNameArr, i);
                break;
            }
        }

        return randomName;
    }

    public static String pickRandomTeamName(){
        String randomName = teamNameArr[(int) (Math.random() * teamNameArr.length)];

        for (int i = 0; i < teamNameArr.length ; i++) {
            if(teamNameArr[i].equals(randomName)){
                teamNameArr = ArrayUtils.remove(teamNameArr, i);
                break;
            }
        }

        return randomName;
    }
}
