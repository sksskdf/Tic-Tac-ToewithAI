package tictactoe;

import java.util.Scanner;

enum TURN {
    FIRST_TURN, SECOND_TURN;

}

enum PLAYER {
    USER, EASY;
}

public class Engine {
    public PLAYER first_player;
    public PLAYER second_player;
    public static TURN current_turn = TURN.FIRST_TURN;

    private final Scanner sc = new Scanner(System.in);

    public Engine() {
        startEngine();
    }

    public void startEngine() {
        final String EXIT = "exit";

        while (true) {
            System.out.print("Input command: ");
            String input = sc.nextLine();
            if (EXIT.equals(input)) {
                break;
            } else {
                if (validInput(input)) {
                    Cells cells = new Cells(first_player, second_player);
                    cells.gameStart();
                }

            }
        }
    }

    public boolean validInput(String input) {
        final String START = "start";
        final String EASY = "easy";
        final String USER = "user";


        String[] split = input.split(" ");

        if (split.length < 3 || !START.equals(split[0])) {
            System.out.println("Bad parameters!");
            return false;
        }

        for (int i = 1; i < split.length; i++) {
            if (!(EASY.equals(split[i]) || USER.equals(split[i]))) {
                System.out.println("Bad parameters!");
                return false;
            }
        }

        first_player = split[1].equals(EASY) ? PLAYER.EASY : PLAYER.USER;
        second_player = split[2].equals(EASY) ? PLAYER.EASY : PLAYER.USER;

        return true;
    }
}
