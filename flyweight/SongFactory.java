package flyweight;

import java.util.HashMap;
import java.util.Map;

public class SongFactory {
    
    private static final Map<String, SongType> songFlyweights = new HashMap<>();

    public static SongType getSongFlyweight(String genre) {
        SongType curSongType = songFlyweights.get(genre);

        if(curSongType == null) {
            SongType newSongType = new SongType(genre);
            songFlyweights.put(genre, newSongType);
            return newSongType;
        }

        return curSongType;
    }

}
