package ru.mirea.practice4;

import javax.swing.*;
import java.awt.*;

public class Soccer extends JFrame{
    private JPanel panel = new JPanel();
    private JButton acmilanbutton = new JButton("AC Milan");
    private JButton realmadridbutton = new JButton("Real Madrid");
    private JLabel lastscorelabel = new JLabel("Last score: ");
    private JLabel resultlabel = new JLabel("Result: ");
    private JLabel winlabel = new JLabel("Winner: ");

    private int mil = 0, rea = 0;

    private Soccer(){
        setTitle("Soccer");
        setLayout(new FlowLayout());
        setContentPane(panel);
        setSize(450, 100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.add(acmilanbutton);
        panel.add(realmadridbutton);
        panel.add(resultlabel);
        panel.add(winlabel);

        acmilanbutton.addActionListener(e -> {
            mil++;
            upd("AC Milan");
        });
        realmadridbutton.addActionListener(e -> {
            rea++;
            upd("Real Madrid");
        });
    }

    private void upd(String last){
        lastscorelabel.setText("Last score: " + last);
        resultlabel.setText("Result: "+ mil + " X " + rea);
        String mr = "DRAW";
        if (mil > rea)
            mr = "AC Milan";
        else if (mil < rea)
            mr = "Real Madrid";
        winlabel.setText("Winner: "+ mr);
    }

    public static void main(String[] args) {
        new Soccer();
    }
}
