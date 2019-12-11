public class Combat {

    public static int getDamage(int weaponValue, int shieldValue) {

        int damage = 0;
        int damageDealt = 0;
        double value = Math.random() * 6;

        if (value == 0) {
            damage = 0;
        } else if (value >= 1 || value <= 4) {
            damage = weaponValue;
        } else {
            damage = weaponValue * 2;
        }

        damageDealt = damage - Enemy.getHp();

        return damageDealt;
    }
}
