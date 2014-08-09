package battle;

/**
 * Created by Nicholas Donaldson on 9/08/2014.
 */
public class Battle {

    /** Who's turn it is
     * 0 = Player
     * 1 = First Monster
     * 2 = Second Monster
     * ect.
     */
    private static int battlePhase = 0;

    /**
     * Runs a battle with a monster.
     *
     * @param monster
     *        The monster the player will battle
     * @param lvl
     *        The level of the monster
     * @param ambush
     *        Checks whether the player was ambushed. If true the monster attacks first
     *
     * @return If the player won the battle
     */
    public static boolean createMonsterEncounter(int monster, int lvl, boolean ambush) {
        int monsterBaseHealth = Math.round(Monster.monsterStats[monster][0] * ((lvl + 9)/10));
        int monsterBaseAttack = Math.round(Monster.monsterStats[monster][1] * ((lvl + 9)/10));
        int monsterBaseDefence = Math.round(Monster.monsterStats[monster][2] * ((lvl + 9)/10));
        System.out.println("Level " + lvl + " " + Monster.monsterNames[monster] + " Encounter!");
        if (ambush) {
            System.out.println("You have been ambushed!");
            battlePhase = 1;
        }
        //These next three line are temporary
        System.out.println("HP: " + monsterBaseHealth);
        System.out.println("AP: " + monsterBaseAttack);
        System.out.println("DP: " + monsterBaseDefence);
        return true;
    }
}
