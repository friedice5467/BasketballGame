class Game{
    private Team teamOne;
    private Team teamTwo;
    private int scoreTeamOne;
    private int ScoreTeamTwo;
    private static boolean isGameEnd;
    private static int gameAmount = 1;

    public Game(Team teamOne, Team teamTwo, int scoreTeamOne, int scoreTeamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreTeamOne = 0;
        this.ScoreTeamTwo = 0;
    }

    public static boolean isGameEnd() {
        return isGameEnd;
    }


    public static int getGameAmount() {
        return gameAmount;
    }

    public void runGame(){
        isGameEnd = false;
        int possessionsPerGame = 100;

        for (int i = 0; i < possessionsPerGame; i++) {
            if(i == possessionsPerGame-1){
                isGameEnd = true;
            }
            scoreTeamOne += teamOne.playPossession(teamOne, teamTwo);
            ScoreTeamTwo += teamTwo.playPossession(teamTwo, teamOne);
        }

        System.out.println("Final Score: \n" + teamOne.getTeamName() + " : " + scoreTeamOne + " points \n "
                + teamTwo.getTeamName() +" : " + ScoreTeamTwo +" points\n");

        System.out.println(teamOne.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamOne.getRoster()){
            System.out.println(player.getName() + " scored " + player.getGamePoints() + " points. \n");
        }

        System.out.println(teamTwo.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamTwo.getRoster()){
            System.out.println(player.getName() + " scored " + player.getGamePoints() + " points. \n");
        }

        resetPoints();

    }

    public void endOfSeason(){
        System.out.println(teamOne.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamOne.getRoster()){
            System.out.println(player.getName() + " scored " + player.getCareerPoints() + " points this season, averaging " +
                    player.getCareerPoints()/getGameAmount() + " per game. \n");
        }

        System.out.println(teamTwo.getTeamName() + " BOX SCORE : \n");
        for(Player player : teamTwo.getRoster()){
            System.out.println(player.getName() + " scored " + player.getCareerPoints() + " points this season, averaging " +
                    player.getCareerPoints()/getGameAmount() + " per game. \n");
        }
    }

    private void resetPoints() {
        if(isGameEnd){
            for(Player playerReset1 : teamOne.getRoster()){
                playerReset1.resetGamePoints();
            }
            for(Player playerReset2 : teamTwo.getRoster()){
                playerReset2.resetGamePoints();
            }
        }
    }
}
