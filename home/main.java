package home;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class main {

public static void main(String[] args) {
JLabel label = new JLabel();
label.setText("Type a number: ");
JTextField textField = new JTextField();
JPanel panel = new JPanel();
JFrame frame = new JFrame();
panel.setLayout(null);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500, 500);
frame.setVisible(true);
frame.add(panel);

label.setBounds(100, 100, 200, 20);
textField.setBounds(200,100,100,20);
panel.add(label);
panel.add(textField);
}
}