package br.newtonPaiva;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class LojaDeDoces {
    public static void main(String[] args) {
        List<Doce> estoque = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Informe o nome do doce: ");
            String nome = scanner.nextLine();

            System.out.print("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            Doce doce = new Doce(nome, quantidade);
            estoque.add(doce);

            System.out.print("Deseja adicionar outro doce? (s/n): ");
            continuar = scanner.nextLine();
        }

        salvarEstoqueEmArquivo(estoque, "C:\\Users\\12115423\\IdeaProjects\\Prova12115423\\src\\ArquivosAdicionais\\estoque.txt");
        System.out.println("Estoque salvo com sucesso!");
    }

    public static void salvarEstoqueEmArquivo(List<Doce> estoque, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Doce doce : estoque) {
                writer.write(doce.getNome() + " - " + doce.getQuantidade());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Doce {
    private String nome;
    private int quantidade;

    public Doce(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}


