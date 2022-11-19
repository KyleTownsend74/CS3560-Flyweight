package flyweight;

// This class holds only the intrinsic (repeating) state for a song
public class SongType {
    
    private String genre;

    public SongType(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

}
