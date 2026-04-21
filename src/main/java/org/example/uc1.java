package org.example;

public class uc1 {

    // Method to initialize and print board
    public static void printBoard() {

        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Print board
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBoard();
    }
}
