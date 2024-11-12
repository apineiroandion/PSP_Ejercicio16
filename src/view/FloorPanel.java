package view;

import javax.swing.*;

public class FloorPanel extends JPanel {
    private JLabel floorLabel;

    public FloorPanel() {
        this.floorLabel = new JLabel("0");
        this.add(floorLabel);
    }

    public void setFloor(Integer floor) {
        this.floorLabel.setText(floor.toString());
        this.repaint();
    }

}
