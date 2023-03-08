import javax.swing.JFrame;
import javax.swing.JButton;
public class myFrame extends JFrame 
{
    myFrame()
    {
        JButton button = new JButton("Square");
        button.setBounds(10, 10, 100, 50);
        button.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(150,150);
        this.setVisible(true);
        this.add(button);
    }
}
