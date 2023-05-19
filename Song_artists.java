package pt.ulusofona.aed.rockindeisi2023 ;

import java.util.ArrayList;

public class Song_artists {
    String temaID;
    ArrayList<String> nomeArtista;

    Song_artists() {
    }

    Song_artists(String temaID, ArrayList<String> nomeArtista) {
        this.temaID = temaID;
        this.nomeArtista = nomeArtista;
    }

    @Override
    public String toString() {
        return "song_artists{" +
                "temaID='" + temaID + " nomeArtista=" + nomeArtista;
    }

}
