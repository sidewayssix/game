public class Enemy {
    private int hp;
    private int att;
    private int def;

    public Enemy(int hp, int att, int def) {
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
