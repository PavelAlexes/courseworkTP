package Main;

import Person.Administrator;
import Person.Student;
import Person.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {


//        System.out.println(User.arrID.size());
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("СДАТЬ СЕССИЮ");
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Administrator A = new Administrator("A", "2", "Weee", "W", 0);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });




    }

    static JFrame getJFrame(){
        JFrame jFrame = new JFrame("University");
        jFrame.setVisible(true);
        jFrame.setSize(300,300);
        jFrame.setLocation(650,300);

        return jFrame;
    }

}