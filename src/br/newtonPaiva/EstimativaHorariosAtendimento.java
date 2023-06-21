package br.newtonPaiva;
//não precisa do package professora e individual da minha maquina
import javax.swing.JOptionPane;

public class EstimativaHorariosAtendimento {
    public static void main(String[] args) {
        // Obter informações do usuário
        String dia = JOptionPane.showInputDialog("Digite o dia de atendimento:");
        int total = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade total de horários de atendimento neste dia:"));
        int hrMarcada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horários já marcados:"));

        // Calcular horários restantes
        int hrs = total - hrMarcada;

        // Exibir mensagem com os horários restantes
        String mensagem = "Na " + dia + " ainda restam " + hrs + " horários.";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
