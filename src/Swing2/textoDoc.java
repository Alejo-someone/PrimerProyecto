package Swing2;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class textoDoc {
    public static void main(String[] args){

        marcoDoc marcoPrincipal = new marcoDoc();
        marcoPrincipal.setVisible(true);
        marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoDoc extends JFrame{

    public marcoDoc(){

        setTitle("Actualizacion de documento");
        setBounds(400, 260, 600, 350);
        laminaDoc lamina1 = new laminaDoc();
        add(lamina1);
    }
}

class laminaDoc extends JPanel{

    public laminaDoc(){

        JTextField campo1 = new JTextField(20);
        add(campo1);
        Document miDoc = campo1.getDocument();
        miDoc.addDocumentListener(new escuchaTexto());
    }

    private class escuchaTexto implements DocumentListener{


        public void insertUpdate(DocumentEvent e) {

            System.out.println("Haz insertado texto");
        }


        public void removeUpdate(DocumentEvent e) {

            System.out.println("Haz removido texto");
        }


        public void changedUpdate(DocumentEvent e) {

            
        }


    }
}
