package com.codecool.sqlapplication.input;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public int gatherIntInput(int range) {
        String userInput;
        int userInt = 1;
        boolean validInput = false;
        while (!validInput) {
            userInput = scanner.next();
            if (!userInput.equals("")) {
                if (userInput.matches("^[0-9]*$")) {
                    userInt = Integer.parseInt(userInput);
                    if (userInt > 0 && userInt <= range) {
                        validInput = true;
                    }
                }
            }
        }
        return userInt;
    }
}
