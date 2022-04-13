import java.util.HashMap;

class Game{
    private Team teamOne;
    private Team teamTwo;
    private int scoreTeamOne;
    private int ScoreTeamTwo;
    HashMap<String, Integer> boxScore;

    public Game(Team teamOne, Team teamTwo, int scoreTeamOne, int scoreTeamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreTeamOne = 0;
        this.ScoreTeamTwo = 0;
        this.boxScore = new HashMap<>();
    }

    public void runGame(){
        int possessionsPerGame = 100;

        for (int i = 0; i < possessionsPerGame; i++) {
            scoreTeamOne += teamOne.playPossession(teamOne, teamTwo);
            ScoreTeamTwo += teamTwo.playPossession(teamTwo, teamOne);
        }

        System.out.println("Final Score: \nTeam One: " + scoreTeamOne + " points \nTeam Two: " + ScoreTeamTwo +" points\n");
    }
}
