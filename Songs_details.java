package pt.ulusofona.aed.rockindeisi2023;

public class Song_details {
    String temaID;
    int duracao;
    boolean letraExplicita;
    int popularidade;
    float dancabilidade;
    float vivacidade;
    float volumeMedio;

    Song_details() {
    }

    Song_details(String temaID, int duracao, boolean letraExplicita, int popularidade
            , float dancabilidade, float vivacidade, float volumeMedio) {
        this.temaID = temaID;
        this.duracao = duracao;
        this.letraExplicita = letraExplicita;
        this.popularidade = popularidade;
        this.dancabilidade = dancabilidade;
        this.vivacidade = vivacidade;
        this.volumeMedio = volumeMedio;
    }

}
