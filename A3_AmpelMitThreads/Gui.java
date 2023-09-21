package A3_AmpelMitThreads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Gui extends JFrame implements ActionListener{
    
    JPanel panel;

    JButton button1;
    JButton button2;
    JButton button3;

    public Gui(){
        this.setSize(500, 500);
        
        //Panel erstellen
        panel = new JPanel();
        //Buttons erstellen
        button1 = new JButton("button1", null);
        button2 = new JButton("button2", null);
        button3 = new JButton("button3", null);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
    }
    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
