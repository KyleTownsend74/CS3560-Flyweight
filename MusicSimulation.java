import java.util.Random;

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
        MusicService musicService = new MusicService();
        Random randObj = new Random();
        int numSongs = 1000000;
        long startTime = System.currentTimeMillis();

        for(int i = 1; i <= numSongs; i++) {
            musicService.uploadSong("Song " + i, "Artist " + i, getRandGenre(randObj));
        }

        System.out.println("Total time taken to upload "+ numSongs 
                + " songs: " + (System.currentTimeMillis() - startTime)
                + " milliseconds");
        // musicService.printSongs();
    }

}
