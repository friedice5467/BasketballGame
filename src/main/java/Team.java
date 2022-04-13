class Team {
    private String teamName;
    private Player[] roster;
    private int offenseScore;
    private int defenseScore;

    public Team(Player[] roster, int offenseScore, int defenseScore) {
        this.roster = roster;
        this.offenseScore = offenseScore;
        this.defenseScore = defenseScore;
        this.teamName = NameGenerator.pickRandomTeamName();
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
        int teamOffense = (int) (Math.random()*team1.offenseScore);
        int teamDefense = (int) (Math.random()*team2.defenseScore);

        if(teamOffense > teamDefense) return 2; //for now simplify to 2 points; no 3 pt or ft
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
            offensePlayer += player.getOffense();
            defensePlayer += player.getDefense();
            roster[i] = player;
        }

        offenseScore = offensePlayer / playersPerTeam;
        defenseScore = defensePlayer / playersPerTeam;

        new Team(roster, offenseScore, defenseScore);
    }
}
