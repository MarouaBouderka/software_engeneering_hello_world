import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class emptylabell {

    public static void main(String[] args) {
        
        // Create a new JFrame instance
        JFrame frame = new JFrame("Text Label Empty");
        
        // Create a new JPanel instance
        JPanel panel = new JPanel();
        
        // Create a new JLabel instance with no text
        JLabel label = new JLabel();
        
        // Set the text property to an empty string
        label.setText("");
        
        // Add the JLabel instance to the JPanel instance
        panel.add(label);
        
        // Add the JPanel instance to the JFrame instance
        frame.add(panel);
        
        // Set the size and visibility of the JFrame instance
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        // Set the close operation of the JFrame instance
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}