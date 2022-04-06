public class Team {
    private String teamName;
    private int playerNumber;

    public String getTeamName() {
        return teamName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public Team(String teamName, int playerNumber) {
        this.teamName = teamName;
        this.playerNumber = playerNumber;
    }
}
