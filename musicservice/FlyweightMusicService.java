package musicservice;

import flyweight.Song;
import flyweight.SongFactory;
import flyweight.SongType;

public class FlyweightMusicService extends MusicService {
    
    public void uploadSong(String name, String artist, String genre) {
        SongType songType = SongFactory.getSongFlyweight(genre);
        Song uploadedSong = new Song(name, artist, songType);
        uploadedSongs.add(uploadedSong);
    }

}
