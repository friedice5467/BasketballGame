import java.util.HashMap;
import java.util.Map;


public class LeagueSim {
    private static HashMap<String, Integer> playerPoints;

    public LeagueSim(HashMap<String, Integer> playerPoints) {
        LeagueSim.playerPoints = new HashMap<>();
    }

    public static HashMap<String, Integer> getPlayerPoints() {
        return playerPoints;
    }

    public static void presentStats(){
        for (Map.Entry<String,Integer> set : playerPoints.entrySet()){
            double avgPoints = set.getValue()/10.0;
            System.out.printf("\n%s scored %d total points, averaging %f per game.\n", set.getKey(), set.getValue(), avgPoints);
        }
    }
}
