class Game{
    private Team teamOne;
    private Team teamTwo;
    private int scoreTeamOne;
    private int ScoreTeamTwo;

    public Game(Team teamOne, Team teamTwo, int scoreTeamOne, int scoreTeamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreTeamOne = scoreTeamOne;
        ScoreTeamTwo = scoreTeamTwo;
    }

    public void runGame(){
        for (int i = 0; i < 100; i++) {
            scoreTeamOne += teamOne.playPossession(teamOne, teamTwo);
            ScoreTeamTwo += teamTwo.playPossession(teamTwo, teamOne);
        }

        System.out.println("Final Score: \nTeam One: " + scoreTeamOne + " points \nTeam Two: " + ScoreTeamTwo +" points");
    }
}
