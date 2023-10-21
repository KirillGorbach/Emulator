package org.example;

import org.example.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        //just example
        Runnable onStepClicked = () -> System.exit(0);
        Runnable onProgramLoadClick = () -> {};
        UserInterface ui = new UserInterface(onStepClicked, onProgramLoadClick);
        ui.setVisible(true);
    }
}