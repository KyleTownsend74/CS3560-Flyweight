package musicservice;
import flyweight.Song;

import java.util.ArrayList;
import java.util.List;

public abstract class MusicService {
    
    protected List<Song> uploadedSongs;

    public MusicService() {
        uploadedSongs = new ArrayList<>();
    }

    public abstract void uploadSong(String name, String artist, String genre);

}