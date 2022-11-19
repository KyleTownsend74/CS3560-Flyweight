import java.util.Random;

import musicservice.FlyweightMusicService;
import musicservice.MusicService;
import musicservice.NoFlyweightMusicService;

public class MusicSimulation {
    
    private static String getRandGenre(Random randObj) {
        int randNum = randObj.nextInt(5);

        switch(randNum) {
            case 0:
                return "Rock";
            case 1:
                return "Pop";
            case 2:
                return "Rap";
            case 3:
                return "Classical";
            case 4:
                return "Jazz";
            default:
                return "Other Genre";
        }
    }

    public static void main(String[] args) {
        MusicService musicService;

        // Argument of "no-flyweight" results in the program using an unoptimized music service
        if(args.length > 0 && args[0].toLowerCase().equals("no-flyweight")) {
            musicService = new NoFlyweightMusicService();
        }
        else {
            musicService = new FlyweightMusicService();
        }

        Random randObj = new Random();
        int numSongs = 20000000;
        long startTime = System.currentTimeMillis();

        for(int i = 1; i <= numSongs; i++) {
            musicService.uploadSong("Song " + i, "Artist " + i, getRandGenre(randObj));
        }

        System.out.println("Total time taken to upload "+ numSongs 
                + " songs: " + (System.currentTimeMillis() - startTime)
                + " milliseconds");
    }

}
