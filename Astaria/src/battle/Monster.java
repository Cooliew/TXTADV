package battle;

/**
 * Created by Nicholas Donaldson on 9/08/2014.
 */
public class Monster {
    public static int level = 0;
    public static int baseAttack = 0;
    public static int baseHealth = 0;
    public static int baseDefence = 0;

    public Monster(int lvl, int ap, int hp, int dp) {
        level = lvl;
        baseAttack = ap;
        baseHealth = hp;
        baseDefence = dp;
    }
}
