package battle;

/**
 * Created by Nicholas Donaldson on 9/08/2014.
 */
public class Monster {

    public static String[] monsterNames = new String[255];
    public static int[][] monsterStats = new int[255][3];

    public static int id = 1;

    static {
        monsterNames[0] = "MissingNo";
    }


    public Monster(String name, int hp, int ap, int dp) {
        monsterNames[id] = name;
        monsterStats[id][0] = hp;
        monsterStats[id][1] = ap;
        monsterStats[id][2] = dp;
        id++;
    }

}
