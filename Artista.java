package pt.ulusofona.aed.rockindeisi2023;

public class Artista {

    String nomeArtista;

    int nrMusicas;

    Artista() {
    }

    Artista(String nomeArtista, int nrMusicas) {

        this.nrMusicas = nrMusicas;
        this.nomeArtista = nomeArtista;

    }

    @Override
    public String toString() {
        return "\nnome: " + nomeArtista + "\n musicas: " + nrMusicas;
    }
}
