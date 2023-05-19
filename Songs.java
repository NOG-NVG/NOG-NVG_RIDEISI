package pt.ulusofona.aed.rockindeisi2023;

import java.util.ArrayList;

public class Songs {
    String temaID;
    String nome;
    int anoLancamento;
    ArrayList<String> nomeArtista;
    int duracao;
    boolean letraExplicita;
    int popularidade;
    float dancabilidade;
    float vivacidade;
    float volumeMedio;

    Songs() {
    }

    Songs(String temaID, String nome, int anoLancamento) {
        this.temaID = temaID;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nomeArtista = new ArrayList<>();
    }


    @Override
    public String toString() {

        return "ID: " + temaID + "\nnome: " + nome + "\nano lancamento: " + anoLancamento + "\nartista: " + nomeArtista + "\nduracao: " + duracao + "\nletra explicita: " + letraExplicita +
                "\npopularidade: " + popularidade + "\ndancabilidade: " + dancabilidade + "\nvivacidade: " + vivacidade + "\nvolume medio: " + volumeMedio + "\n";
    }
}
