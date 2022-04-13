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

    public String generateName(){
        return name = NameGenerator.pickRandomPlayerName();
    }

    public int getOffense() {
        return offense;
    }

    public int getDefense() {
        return defense;
    }

    public void makeRandomPlayer() {
        offense = (int) (Math.random()*100);
        defense = 100 - offense;
        new Player(offense, defense);
    }
}
