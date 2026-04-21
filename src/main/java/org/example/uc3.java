package org.example;

import java.util.Scanner;

public class uc3 {

    // Method to take user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userSlot = getUserInput();  // calling method

        System.out.println("You selected slot: " + userSlot);
    }
}