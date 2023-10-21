package org.example.ui;

import org.example.model.UiState;

import javax.swing.*;
import java.awt.*;

/**
 * Class for holding and rendering application ui
 */
public class UserInterface extends JFrame {

    private static final String SCREEN_NAME = "Emulator";
    private static final String BTN_STEP_NAME = "Step";
    private static final String BTN_LOAD_PROGRAM_NAME = "Load program";

    /**
     *
     * @param onStepClick callback on user press "Step"
     * @param onProgramLoadClick callback on user press "Load pogram"
     */
    public UserInterface(Runnable onStepClick, Runnable onProgramLoadClick) throws HeadlessException {
        //example
        initScreen();
        JPanel panel = createPanel();
        JButton step = createStepButton(onStepClick);
        panel.add(step);
    }

    public void render(UiState uiState) {
        //TODO: implementation
    }

    private JPanel createPanel() {
        Dimension size = getToolkit().getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height -
                getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        return panel;
    }

    private JButton createStepButton(Runnable onStepClick) {
        JButton step = new JButton(BTN_STEP_NAME);
        step.setBounds(50, 60, 80, 30);
        step.addActionListener(event -> onStepClick.run());
        return step;
    }

    private void initScreen() {
        setSize(300, 200);
        setTitle(SCREEN_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
