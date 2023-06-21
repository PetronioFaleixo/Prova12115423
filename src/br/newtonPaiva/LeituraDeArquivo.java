package br.newtonPaiva;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraDeArquivo {

    public static void main(String[] args) {
        //aqui vc vai colocar a lista de dias da semana e musicas que você tem professora
        String diasSemana = "C:\\Users\\12115423\\IdeaProjects\\Prova12115423\\src\\ArquivosAdicionais\\dias.txt";
        String musicas = "C:\\Users\\12115423\\IdeaProjects\\Prova12115423\\src\\ArquivosAdicionais\\musicas.txt";
//aqui vai salvar em uma vaiavel e chamar o metodo lerarquivo mandando os dias e as musicas
        List<String> dia = lerArquivo(diasSemana);
        List<String> musica = lerArquivo(musicas);
//aqui vai percorrer os dias e musicas
        for (int i = 0; i < dia.size() || i < musica.size(); i++) {
            String catalogo = dia.get(i) + " " + musica.get(i);
            System.out.println(catalogo);
        }
    }


    private static List<String> lerArquivo(String nomeArquivo) {
        List<String> linhas = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                linhas.add(linha);
                linha = leitor.readLine();
            }
            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }

}
