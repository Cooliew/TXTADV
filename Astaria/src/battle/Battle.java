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
    public static int monster1ID = 0;

    /**
     * Runs a battle with a monster.
     *
     * @param monster1
     *        The name of the monster the player will battle
     * @param monster1Lvl
     *        The level of the monster
     * @param ambush
     *        Checks whether the player was ambushed. If true the monster attacks first
     *
     * @return If the player won the battle
     */
    public static boolean createMonsterEncounter(String monster1, int monster1Lvl, boolean ambush) {
        for (int i = 0; i < Monster.monsterNames.length; i++) {
            if (Monster.monsterNames[i] == monster1)
                monster1ID = i;
        }
        int monsterBaseHealth = Math.round(Monster.monsterStats[monster1ID][0] * ((monster1Lvl + 9)/10));
        int monsterBaseAttack = Math.round(Monster.monsterStats[monster1ID][1] * ((monster1Lvl + 9)/10));
        int monsterBaseDefence = Math.round(Monster.monsterStats[monster1ID][2] * ((monster1Lvl + 9)/10));
        System.out.println("Level " + monster1Lvl + " " + Monster.monsterNames[monster1ID] + " Encounter!");
        if (ambush) {
            System.out.println("You have been ambushed!");
            battlePhase = 1;
        }
        //These next three line are temporary
        System.out.println("HP: " + monsterBaseHealth);
        System.out.println("AP: " + monsterBaseAttack);
        System.out.println("DP: " + monsterBaseDefence);
        monster1ID = 0;
        return true;
    }
}
