package flyweight;

// This class represents an entire song, including both intrinsic (repeating)
// and extrinsic (non-repeating) state
public class Song {
    
    private String name;
    private String artist;
    private SongType songType;

    public Song(String name, String artist, SongType songType) {
        this.name = name;
        this.artist = artist;
        this.songType = songType;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return songType.getGenre();
    }

}
