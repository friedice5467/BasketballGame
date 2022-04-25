class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        //create 2 teams to play against each other
        Team team1 = new Team(new Player[]{},0,0);
        team1.makeRandomTeam();
        Team team2 = new Team(new Player[]{},0,0);
        team2.makeRandomTeam();

        for (int i = 0; i < Game.getGameAmount(); i++) {

            Game game = new Game(team1, team2,0 ,0);

            game.runGame();
            if(i == Game.getGameAmount() -1){
                game.endOfSeason();
            }
        }
    }
}
