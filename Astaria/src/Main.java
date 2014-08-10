import battle.Battle;
import battle.Monster;

import java.io.*;
import java.util.Scanner;

/**
 * VERSION ID = 1.0
 * Created by Laurence Williams and Nicholas Donaldson
 */

public class Main {
    static String loadFilename;
    static String newFilename;



    final static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        title();
        newOrLoadSeq();
        loadMonsters();
    }

    public static void newOrLoadSeq() throws IOException {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(istream);
        System.out.println("Would you like to start a new game or load an old one?");
        String newOrLoad = bufRead.readLine();

        if (newOrLoad.equals("load")){
            System.out.println("Filename:");
            loadFilename = bufRead.readLine();

            start(loadFilename);
        } else if (newOrLoad.equals("new")) {
            System.out.println("Filename:");
            newFilename = bufRead.readLine();

            charCreation(newFilename);
        } else if (newOrLoad.equals("exit")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid Command");
            newOrLoadSeq();
        }
    }

    public static void loadMonsters() {
        /** Load the monsters into the game
         *  To add a new monster type:
         *  "new Monster(name, health, attack, defence)"
         */
        new Monster("Goblin", 1, 2, 3);
        new Monster("Witch", 2, 3, 1);
        new Monster("Guard", 3, 1, 2);
    }

    public static void title() {
        System.out.println("  ___      _             _       ");
        System.out.println(" / _ \\    | |           (_)      ");
        System.out.println("/ /_\\ \\___| |_ __ _ _ __ _  __ _ ");
        System.out.println("|  _  / __| __/ _` | '__| |/ _` |");
        System.out.println("| | | \\__ \\ || (_| | |  | | (_| |");
        System.out.println("\\_| |_/___/\\__\\__,_|_|  |_|\\__,_|");
        System.out.println("Text Adventure created by Laurence Williams and Nicholas Donaldson");
        System.out.println("");
    }

    public static void charCreation(String filename) {
        System.out.println(filename);
    }

    public static void start(String filename){
        System.out.println(filename);
    }
}
