package br.newtonPaiva;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LeituraDeArquivosVoo {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\12115423\\IdeaProjects\\Prova12115423\\src\\ArquivosAdicionais\\promo.txt";
        String mes = JOptionPane.showInputDialog("Informe o mês desejado:");
        String opcoes = buscarPromocoesPorMes(filePath, mes);
        JOptionPane.showMessageDialog(null, "Opções para o mês " + mes + " são:\n" + opcoes);
    }

    public static String buscarPromocoesPorMes(String filePath, String mes) {
        StringBuilder opcoes = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(" - ");
                if (partes.length == 3) {
                    String mesPromocao = partes[0];
                    String cidade = partes[1];
                    String valor = partes[2];

                    if (mesPromocao.equalsIgnoreCase(mes)) {
                        opcoes.append(cidade).append(" - ").append(valor).append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return opcoes.toString();
    }
}