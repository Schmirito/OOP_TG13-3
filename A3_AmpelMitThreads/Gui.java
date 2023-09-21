package A3_AmpelMitThreads;

import javax.swing.JFrame;

public class Gui{
    public static void main(String[] args) {

        JFrame gui = new JFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setTitle("Ampeln");

        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setSize(500, 500);
    }
}
