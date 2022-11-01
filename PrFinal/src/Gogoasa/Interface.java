package Gogoasa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface {
    private static ArrayList<Gogoasa> v = new ArrayList<Gogoasa>();
    private JPanel Panel;
    private JLabel Nume;
    private JTextField nume;
    private JLabel Pret;
    private JTextField pret;
    private JLabel Gramaj;
    private JTextField gramaj;
    private JLabel screen;
    private JButton introducereButton;
    private JButton scumpireButton;
    private JButton ieftinireButton;
    private JLabel Message;
    private JTextField val1;
    private JTextField val2;
    private JTextField unic;
    private JButton validareButton;

    public Interface()
    {
        introducereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gogoasa g = new Gogoasa();
                g.setTip(nume.getText());
                g.setPret(Parsare(pret)+2);
                g.setGramaj(Parsare(gramaj));
                Interface.v.add(g);
                nume.setText("");
                pret.setText("");
                gramaj.setText("");
                screen.setText(getList());
                Message.setVisible(false);
            }

        });
        scumpireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scumpire(Parsare(val1),Parsare(unic));
                screen.setText(getList());
                Message.setVisible(false);
            }
        });
        ieftinireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ieftinire(Parsare(val2),Parsare(unic));
                screen.setText(getList());
                Message.setVisible(false);
            }
        });
        validareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validare(Parsare(unic));
            }
        });
    }
    private String getList(){
        String msg = "";
        int i = 0;
        for(Gogoasa gogoasa:Interface.v){
            i++;
            msg= msg+ "Gogoasa " +i+") "+gogoasa.getTip()+" "+gogoasa.getPret()+" "+gogoasa.getGramaj();
        }
        return msg;
    }
    private double Parsare(JTextField textfield){
        try
        {
            return Double.parseDouble(textfield.getText());
        }
        catch(Exception ex){
            System.out.println("Valoarea introdusa nu este un intreg");
            return 0;
        }
    }

    public static void main(String args[])
    {
        Interface UI = new Interface();
        JFrame frame = new JFrame("Gogoserie");
        frame.setContentPane(UI.getPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public JPanel getPanel()
    {
        return this.Panel;
    }
    private void scumpire(double val,double nrGramaj){
        for(Gogoasa g:Interface.v){
            if(g.getGramaj()==nrGramaj){
                g.setPret(g.getPret()+val);
                break;
            }
        }
    }

    private void ieftinire(double val,double nrGramaj){
        for(Gogoasa g:Interface.v){
            if(g.getGramaj()==nrGramaj){
                g.setPret(g.getPret()-val);
                break;
            }
        }
    }

    private void validare(double nrGramaj){
        for(Gogoasa g:Interface.v){
            if(g.getGramaj()==nrGramaj){
                if(g.getPret()<=0){
                    System.out.println("Gogoasa nu este valida!");
                }else{
                    System.out.println("Gogoasa este valida!");
                }
            }
        }
    }

    public JTextField getPret(){
        return pret;
    }
    public JTextField getNume(){
        return nume;
    }
    public JTextField getGramaj(){
        return gramaj;
    }

}
