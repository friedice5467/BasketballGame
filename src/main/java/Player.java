class Player {
    private int offense;
    private int defense;

    public Player(int offense, int defense) {
        this.offense = offense;
        this.defense = defense;
    }

    public int getOffense() {
        return offense;
    }

    public int getDefense() {
        return defense;
    }

    public Player makeRandomPlayer() {
        offense = (int) (Math.random()*99);
        defense = 100 - offense;
        return new Player(offense, defense);
    }
}
