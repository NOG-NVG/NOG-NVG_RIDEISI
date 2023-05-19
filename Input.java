package pt.ulusofona.aed.rockindeisi2023;

public class Input {
    String nomeFicheiro;
    int linhasOK;
    int linhasNOK;
    int primeiraLinhaNOK;

    Input() {
    }

    Input(String nomeFicheiro, int linhasOK, int linhasNOK, int primeiraLinhaNOK) {

        this.nomeFicheiro = nomeFicheiro;
        this.linhasOK = linhasOK;
        this.linhasNOK = linhasNOK;
        this.primeiraLinhaNOK = primeiraLinhaNOK;
    }

    public String toString() {

        return nomeFicheiro + " | " + linhasOK + " | " + linhasNOK + " | " + primeiraLinhaNOK;
    }

}
