package musicservice;

import flyweight.Song;
import flyweight.SongType;

public class NoFlyweightMusicService extends MusicService {
    
    public void uploadSong(String name, String artist, String genre) {
        SongType songType = new SongType(genre);
        Song uploadedSong = new Song(name, artist, songType);
        uploadedSongs.add(uploadedSong);
    }

}
