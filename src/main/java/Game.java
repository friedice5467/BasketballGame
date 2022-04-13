import java.util.Arrays;
import java.util.HashMap;

class Game{
    private Team teamOne;
    private Team teamTwo;
    private int scoreTeamOne;
    private int ScoreTeamTwo;
    private static HashMap<String, Integer> boxScore;

    public Game(Team teamOne, Team teamTwo, int scoreTeamOne, int scoreTeamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreTeamOne = 0;
        this.ScoreTeamTwo = 0;
        Game.boxScore = new HashMap<>();
    }


    public static HashMap<String, Integer> getBoxScore() {
        return boxScore;
    }

    public void runGame(){
        int possessionsPerGame = 100;

        for (int i = 0; i < possessionsPerGame; i++) {
            scoreTeamOne += teamOne.playPossession(teamOne, teamTwo);
            ScoreTeamTwo += teamTwo.playPossession(teamTwo, teamOne);
        }

        System.out.println("Final Score: \nTeam One: " + scoreTeamOne + " points \nTeam Two: " + ScoreTeamTwo +" points\n");

        System.out.println(teamOne.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamOne.getRoster()){
            System.out.println(player.getName());
            System.out.println(player.getName() + " scored " + boxScore.get(player.getName()) + " points. \n");
        }

        System.out.println(teamTwo.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamTwo.getRoster()){
            System.out.println(player.getName());
            System.out.println(player.getName() + " scored " + boxScore.get(player.getName()) + " points. \n");
        }
    }
}
