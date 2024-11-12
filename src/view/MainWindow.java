package view;

import controller.AscensorController;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    FloorPanel floorPanel;
    public MainWindow(AscensorController ascensorController, FloorPanel floorPanel) {
        this.setTitle("Ascensor");
        this.setSize(200, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.floorPanel = floorPanel;

        ButtonPanel buttonPanel = new ButtonPanel(floorPanel, ascensorController);

        this.add(floorPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

}
