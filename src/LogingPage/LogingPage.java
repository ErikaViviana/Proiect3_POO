package LogingPage;

import ParcAuto.Masina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogingPage extends JFrame{
    private JPanel panel1;
    private JTextField userText;
    private JPasswordField password;
    private JButton logingbutton;
    private JLabel User;
    private JLabel mesaj;
    private JFrame frame;

    public LogingPage() {
        frame=new JFrame("Loging Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.setResizable(false);

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        logingbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userText == null)
                    JOptionPane.showConfirmDialog(new JFrame(),
                "Introduceti user");
                else if (password == null)
                    JOptionPane.showConfirmDialog(new JFrame(),
                            "Introduceti parola");


                else
                    JOptionPane.showConfirmDialog(new JFrame(),
                    "Ati introdus datele corect");

                userText.setText("");
                password.setText("");
            }
        });
    }
}
