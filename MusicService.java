import flyweight.Song;
import flyweight.SongFactory;
import flyweight.SongType;

import java.util.ArrayList;
import java.util.List;

public class MusicService {
    
    private List<Song> uploadedSongs;

    public MusicService() {
        uploadedSongs = new ArrayList<>();
    }

    public void uploadSong(String name, String artist, String genre) {
        SongType songType = SongFactory.getSongFlyweight(genre);
        Song uploadedSong = new Song(name, artist, songType);
        uploadedSongs.add(uploadedSong);
        System.out.println("Uploaded song... Name: " + uploadedSong.getName()
                + " Artist: " + uploadedSong.getArtist() 
                + " Genre: " + uploadedSong.getGenre());
    }

    // public void printSongs() {
    //     for(Song uploadedSong : uploadedSongs) {
    //         System.out.println("Name: " + uploadedSong.getName() + " Artist: " 
    //                 + uploadedSong.getArtist() + " Genre: " 
    //                 + uploadedSong.getGenre());
    //     }
    // }

}