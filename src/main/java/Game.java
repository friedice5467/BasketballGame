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
        LeagueSim leagueSim = new LeagueSim(new HashMap<>());
        int possessionsPerGame = 100;

        for (int i = 0; i < possessionsPerGame; i++) {
            scoreTeamOne += teamOne.playPossession(teamOne, teamTwo);
            ScoreTeamTwo += teamTwo.playPossession(teamTwo, teamOne);
        }

        System.out.println("Final Score: " + teamOne.getTeamName() + " : " + scoreTeamOne + " points \n " + teamTwo.getTeamName() +" : " + ScoreTeamTwo +" points\n");

        System.out.println(teamOne.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamOne.getRoster()){
            if(boxScore.get(player.getName()) == null) System.out.println( player.getName() + " scored 0 points. \n");
            else {
                LeagueSim.getPlayerPoints().merge(player.getName(), 2, Integer::sum);
                System.out.println(player.getName() + " scored " + boxScore.get(player.getName()) + " points. \n");
            }
        }

        System.out.println(teamTwo.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamTwo.getRoster()){
            if(boxScore.get(player.getName()) == null) System.out.println( player.getName() + " scored 0 points. \n");
            else{
                LeagueSim.getPlayerPoints().merge(player.getName(), 2, Integer::sum);
                System.out.println(player.getName() + " scored " + boxScore.get(player.getName()) + " points. \n");
            }
        }
    }
}
