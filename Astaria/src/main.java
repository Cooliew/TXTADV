import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * VERSION ID = 1.0
 * Created by Laurence Williams
 */

public class main {
    static String loadFilename;
    static String newFilename;

    final static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        title();
        newOrLoadSeq();
    }

    public static void clear() throws IOException{
        Runtime.getRuntime().exec("cls");
    }

    public static void newOrLoadSeq() throws IOException {
        System.out.println("Would you like to start a new game or load an old one?");

        public String newOrLoad;
        newOrLoad = userInput.readLine();

        if (newOrLoad=="load"){
            System.out.println("Filename:");
            loadFilename = userInput.nextLine();

            start(loadFilename);
        } else if (newOrLoad=="new") {
            System.out.println("Filename:");
            newFilename = userInput.nextLine();

            charCreation(newFilename);
        } else if (newOrLoad=="exit") {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid Command");
            newOrLoadSeq();
            //TODO: Fix the Invalid Command whenever you enter your choice in newOrLoadSeq
        }
    }

    public static void title() {
        System.out.println("  ___      _             _       ");
        System.out.println(" / _ \\    | |           (_)      ");
        System.out.println("/ /_\\ \\___| |_ __ _ _ __ _  __ _ ");
        System.out.println("|  _  / __| __/ _` | '__| |/ _` |");
        System.out.println("| | | \\__ \\ || (_| | |  | | (_| |");
        System.out.println("\\_| |_/___/\\__\\__,_|_|  |_|\\__,_|");
        System.out.println("Text Adventure created by Laurence Williams");
        System.out.println("");
    }

    public static void charCreation(String filename) {
        System.out.println(filename);
    }

    public static void start(String filename){
        System.out.println(filename);
    }
}
