public class Items {

    private int rocks;
    private int potions;

    public Items(int rocks, int potions) {
        this.rocks = rocks;
        this.potions = potions;
    }

    public int getRocks() {
        return rocks;
    }

    public void setRocks(int rocks) {
        this.rocks = rocks;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public void potion(int potions){
        if (potions > 0) {
            potions--;
            Player.setHp() = Player.getMaxHp();
        }
    }

    public void rock(int rocks) {
        if (rocks > 0) {
            rocks--;
            Enemy.getHp() - 50;
        }
    }
}
