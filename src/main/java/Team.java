class Team {
    private String teamName;
    private Player[] roster;
    private int offenseScore;
    private int defenseScore;

    public Team(Player[] roster, int offenseScore, int defenseScore) {
        this.roster = roster;
        this.offenseScore = offenseScore;
        this.defenseScore = defenseScore;
    }

    public void generateTeamName(){
        teamName = NameGenerator.pickRandomTeamName();
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getRoster() {
        return roster;
    }

    public int getOffenseScore() {
        return offenseScore;
    }

    public int getDefenseScore() {
        return defenseScore;
    }

    public int playPossession(Team team1, Team team2){
        Player player1 = team1.roster[(int) (Math.random() * roster.length)];//possession and defense is still random, will change to
        Player player2 = team2.roster[(int) (Math.random() * roster.length)];//rating based later\




        if(player1.getOffense() > player2.getDefense()){
            player1.setGamePoints(player1.getGamePoints()+2);
            player1.setCareerPoints(player1.getCareerPoints()+2);

            return 2;
        }

        else if(player2.getOffense() > player1.getDefense()){
            player2.setGamePoints(player2.getGamePoints()+2);
            player2.setCareerPoints(player2.getCareerPoints()+2);

            return 2;
        }
        return 0;
    }

    public void makeRandomTeam(){
        int playersPerTeam = 5;

        int offensePlayer = 0;
        int defensePlayer = 0;
        roster = new Player[playersPerTeam];

        for (int i = 0; i < playersPerTeam; i++) {
            Player player = new Player(offensePlayer, defensePlayer);
            player.makeRandomPlayer();
            player.generateName();
            offensePlayer += player.getOffense();
            defensePlayer += player.getDefense();
            roster[i] = player;
        }

        offenseScore = offensePlayer / playersPerTeam;
        defenseScore = defensePlayer / playersPerTeam;

        new Team(roster, offenseScore, defenseScore);
        generateTeamName();
    }
}
