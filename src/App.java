import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Player player;

    public static void main(String[] args) {
        initializeGame();
        showIntroduction();
        ChapterOne.startChapter();
        //mainGameLoop();
    }

    private static void initializeGame() {
        System.out.println("DIGITAL DESCENDANTS");
        separationLine();
    }

    private static void showIntroduction() {
        System.out.println("\nYou were just another CS student, debugging code late at night...");
        System.out.println("Suddenly, your screen glows with strange symbols...");
        System.out.println("You wake up in a world where technology is mistaken for magic.");
        
        System.out.println("\nAs you gather your bearings, a young woman in digital-patterned robes approaches.");
        emptyLine();
        System.out.println("Mysterious woman:");
        System.out.println("\"Are you alright? You seem... different from the others.\" she says.");
        System.out.println("\"I'm Ada, a Code Weaver. And you are...?\"");
        emptyLine();
        getPlayerName();
        System.out.println("\nAda's eyes light up with interest.");
        emptyLine();
        System.out.println("Ada:");
        System.out.println("\"Welcome, " + player.getName() + "\"");
    }

    public static void emptyLine() {
        System.out.println();
    }

    public static void separationLine() {
        emptyLine();
        System.out.println("=========================================");
        emptyLine();
    }

    public static int interaction(String message, String optionOne, String optionTwo) {
        System.out.println(message);
        emptyLine();
        System.out.println("1. " + optionOne);
        System.out.println("2. " + optionTwo);
        System.out.println("(Press 1 or 2 to choose answer)");
        int choice = scanner.nextInt();
        emptyLine();
        return choice;
    }

    public static String getPlayerName() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        while (name.trim().isEmpty()) {
            System.out.println("Name cannot be empty. Please try again:");
            name = scanner.nextLine();
        }
        player = new Player(name);
        return player.getName();
    }

    public static String getCurrentPlayerName() {
        return player.getName();
    }

/*
    private static void mainGameLoop() {
        boolean gameRunning = true;
        while (gameRunning) {
            displayMainMenu();
            String choice = scanner.nextLine();
            processChoice(choice);
        }
    }*/
}
