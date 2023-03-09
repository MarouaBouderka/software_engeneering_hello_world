package homework2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
    
    	JLabel label =new JLabel();
    	label.setText("Type a number: ");
 
    	 JPanel p = new JPanel();
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(500,500);
    	frame.setVisible(true);
    	frame.add(p);
    	
    	 p.add(label);
    	

    }
    
}
