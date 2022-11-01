package LogingPage;

import javax.swing.*;
import java.awt.*;

public class LogingPage extends JFrame{
    private JPanel panel1;
    private JTextField userText;
    private JPasswordField password;
    private JButton logingbutton;
    private JFrame frame;

    public LogingPage(){
        frame=new JFrame("Loging Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.setResizable(false);

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
