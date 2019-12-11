public class Player {

    private final int maxHp;
    private int hp;

    public Player(int maxHp, int hp) {
        this.maxHp = 100;
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
