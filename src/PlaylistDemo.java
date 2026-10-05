/*
PlaylistDemo.java
Driver program to test the Track class.
Alper Can
240444001
05.10.2026
 */

public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        // Default constructor
        track defaultTrack = new track();
        System.out.println("Default Track: ");
        System.out.println(defaultTrack);
        System.out.println();

        // Title only constructor
        track titleOnlyTrack = new track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleOnlyTrack);
        System.out.println();

        // Title and artist constructor
        track titleArtistTrack = new track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack);
        System.out.println();

        // Full constructor
        track fullTrack = new track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();

        // Invalid duration test
        System.out.println("Invalid Duration Test:");
        track invalidTrack = new track("Broken Clock", "Static Noise", -45, false);
        System.out.println(invalidTrack);
        System.out.println();

        // Getter test
        track testTrack = new track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.printf("%-10s %s%n", "Title:", testTrack.getTitle());
        System.out.printf("%-10s %s%n", "Artist:", testTrack.getArtist());
        System.out.printf("%-10s %s%n", "Duration:", testTrack.getDurationFormatted());
        System.out.printf("%-10s %s%n", "Explicit:", testTrack.getIsExplicit());
    }
}
