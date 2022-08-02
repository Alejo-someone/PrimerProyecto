package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboBox {
    
    public static void main(String[] args){

        marcoCombo marco9 = new marcoCombo();
        marco9.setVisible(true);
        marco9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoCombo extends JFrame{

    public marcoCombo(){

        setBounds(400, 450, 600, 300);
        laminaCombo lamina9 = new laminaCombo();
        add(lamina9);
    }
}

class laminaCombo extends JPanel{

    public laminaCombo(){

        setLayout(new BorderLayout());
        texto = new JLabel("Aqui va nuestro tipico texto de prueba :v  ....");
        texto.setFont(new Font("Serif", Font.PLAIN, 16));
        add(texto, BorderLayout.CENTER);

        JPanel laminaNorte = new JPanel();
        micombo = new JComboBox<>();
        micombo.setEditable(true);
        micombo.addItem("Helvetica");
        micombo.addItem("Times New Roman");
        micombo.addItem("Calibri");
        micombo.addItem("Monospaced");

        eventoCombo mievento = new eventoCombo();
        micombo.addActionListener(mievento);
        laminaNorte.add(micombo);
        add(laminaNorte, BorderLayout.NORTH);
    }

    private class eventoCombo implements ActionListener{

        public void actionPerformed(ActionEvent e){

            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
        }
    }

    private JLabel texto;
    private JComboBox micombo;
}
