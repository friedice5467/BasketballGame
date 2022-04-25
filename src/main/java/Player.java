class Player {
    private String name;
    private int offense;
    private int defense;
    private int gamePoints;
    private int careerPoints;



    public Player(int offense, int defense) {
        this.offense = offense;
        this.defense = defense;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public void resetGamePoints(){
        gamePoints = 0;
    }

    public void setCareerPoints(int careerPoints) {
        this.careerPoints = careerPoints;
    }

    public String getName() {
        return name;
    }

    public void generateName(){
        name = NameGenerator.pickRandomPlayerName();
    }

    public int getOffense() {
        return offense;
    }

    public int getDefense() {
        return defense;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public int getCareerPoints() {
        return careerPoints;
    }

    public void makeRandomPlayer() {//simplifies so every player is basically the same, for now
        offense = (int) (Math.random()*100);
        defense = 100 - offense;
        new Player(offense, defense);
    }
}
