class Player {
    private String name;
    private int offense;
    private int defense;


    public Player(int offense, int defense) {
        this.offense = offense;
        this.defense = defense;
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

    public void makeRandomPlayer() {//simplifies so every player is basically the same, for now
        offense = (int) (Math.random()*100);
        defense = 100 - offense;
        new Player(offense, defense);
    }
}
