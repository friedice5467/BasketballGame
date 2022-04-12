class Team {
    private Player[] roster;
    private int offenseScore;
    private int defenseScore;

    public Team(Player[] roster, int offenseScore, int defenseScore) {
        this.roster = roster;
        this.offenseScore = offenseScore;
        this.defenseScore = defenseScore;
    }

    public int playPossession(Team team1, Team team2){
        int teamOffense = (int) (Math.random()*team1.offenseScore);
        int teamDefense = (int) (Math.random()*team2.defenseScore);

        if(teamOffense > teamDefense) return 2;
        return 0;
    }

    public Team makeRandomTeam(){
        int offensePlayer = 0;
        int defensePlayer = 0;
        roster = new Player[5];

        for (int i = 0; i < 5; i++) {
            Player player = new Player(offensePlayer, defensePlayer);
            player.makeRandomPlayer();
            offensePlayer += player.getOffense();
            defensePlayer += player.getDefense();
            roster[i] = player;
        }

        offenseScore = offensePlayer / 5;
        defenseScore = defensePlayer / 5;

        return new Team(roster, offenseScore, defenseScore);
    }
}
