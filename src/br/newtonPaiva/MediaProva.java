package br.newtonPaiva;

import javax.swing.*;
import javax.swing.JOptionPane;

public class MediaProva {
    public static void main(String[] args) {

        int av1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Sua nota da AV1"));
        int av2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Sua nota da AV2"));

        int media = (av1 + av2) / 2;

        try {
            String mensagem = "Sua média é : " + media ;
            JOptionPane.showMessageDialog(null, mensagem);
        }
        catch (ArithmeticException al) {
            if(av1 == 0 && av2 == 0 )
            {
                JOptionPane.showMessageDialog(null,
                        "Não e possivel dividir Se as duas forem igual a zero");
            }
            JOptionPane.showMessageDialog(null, al);
        }
    }
}
