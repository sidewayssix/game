public class Items {

    private Player player1;
    private Enemy enemy;
    private int rocks;
    private int potions;

    public Items(Player player1, int rocks, int potions) {
        this.player1 = player1;
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

    public void usePotion(){
        if (potions > 0) {
            potions--;
            System.out.println("You use a Potion, restoring yourself to full Health.");
            player1.setHp(player1.getMaxHp());
        }
    }

    public void useRock() {
        if (rocks > 0) {
            rocks--;
            System.out.println("You throw a rock really really hard at the enemy, dealing 50 Damage.");
            enemy.setHp(-50);
        }
    }
}
