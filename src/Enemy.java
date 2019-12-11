public class Enemy {

    private String name;
    private int hp;
    private int att;
    private int def;

    public Enemy(String name, int hp, int att, int def) {
        this.name = name;
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    public int getDef() {
        return def;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
