package tictactoe;

import java.util.Scanner;

public class Cells {
    PLAYER first_player;
    PLAYER second_player;
    Scanner scanner = new Scanner(System.in);

    public Cells(PLAYER first_player, PLAYER second_player) {
        this.first_player = first_player;
        this.second_player = second_player;
    }

    public void gameStart() {
        Cells cells = new Cells(first_player, second_player);
        while (true) {
            switch (Engine.current_turn) {
                case FIRST_TURN : {
                    switch (first_player) {
                        case USER : {
                            System.out.println("it's user's turn");
                            break;
                        }
                        case EASY : {
                            System.out.println("it's ai's turn");
                        }
                    }
                    Engine.current_turn = TURN.SECOND_TURN;
                }
                case SECOND_TURN : {
                    switch (second_player) {
                        case USER : {
                            System.out.println("it's user's turn");
                            break;
                        }
                        case EASY : {
                            System.out.println("it's ai's turn");
                        }
                    }
                    Engine.current_turn = TURN.FIRST_TURN;
                }
            }
        }
    }
}
