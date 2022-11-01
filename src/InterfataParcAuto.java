import ParcAuto.Masina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfataParcAuto {
    private JPanel panel;
    private JList listaInterfata;
    private JButton ieftinire;
    private JButton scumpire;
    private JButton pretAutomat;
    private JTextField denumire;
    private JLabel denumireLabel;
    private JTextField culoare;
    private JLabel culoareLabel;
    private JLabel putereLabel;
    private JTextField putere;
    private JLabel pretLabel;
    private JLabel valoareLabel;
    private JButton introducere;

    private ArrayList<Masina> listaMasini = new ArrayList<Masina>();

    public InterfataParcAuto() {
        pretAutomat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(putere.getText()) >= 100){
                    valoareLabel.setText("25000");
                }else{
                    valoareLabel.setText("20000");
                }
            }
        });
        ieftinire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pretMasina = Integer.parseInt(valoareLabel.getText());
                pretMasina -= 1000;
                StringBuffer pret = new StringBuffer();
                pret.append(pretMasina);
                valoareLabel.setText(pret.toString());
            }
        });
        scumpire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pretMasina = Integer.parseInt(valoareLabel.getText());
                pretMasina += 1000;
                StringBuffer pret = new StringBuffer();
                pret.append(pretMasina);
                valoareLabel.setText(pret.toString());
            }
        });
        introducere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(valoareLabel.getText()) == 0){
                    mesajDeEroare();
                } else if (!denumire.getText().isEmpty() && !culoare.getText().isEmpty() && !putere.getText().isEmpty()) {
                    listaMasini.add(new Masina(denumire.getText(), culoare.getText(),Integer.parseInt(putere.getText()), Integer.parseInt(valoareLabel.getText())));
                    actualizeazaLista();
                }else{
                    mesajDeEroareLabel();
                    return;
                }
                denumire.setText("");
                culoare.setText("");
                putere.setText("");
                valoareLabel.setText("0");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Parc Auto");
        InterfataParcAuto iParcAuto = new InterfataParcAuto();
        frame.setContentPane(iParcAuto.panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void mesajDeEroare(){
        JOptionPane.showConfirmDialog(new JFrame(),
                "Pret incorect/nesetat!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private void mesajDeEroareLabel(){
        JOptionPane.showConfirmDialog(new JFrame(),
                "Labeluri goale!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private void actualizeazaLista(){
        ArrayList<String> listaInterfataMasini = new ArrayList<String>();
        for(Masina i : listaMasini){
            StringBuffer lista = new StringBuffer();
            lista.append(i.getDenumire());
            lista.append(" ");
            lista.append(i.getCuloare());
            lista.append(" ");
            lista.append(i.getPutere());
            lista.append(" ");
            lista.append(i.getPret());
            listaInterfataMasini.add(lista.toString());
        }
        listaInterfata.setListData(listaInterfataMasini.toArray());
    }
}
