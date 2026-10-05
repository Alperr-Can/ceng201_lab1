/*
track.java
Alper Can
240444001
05.10.2026
 */

public class track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    public track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds;
        } else {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        }
    }

    public track(String title, String artist) {
        this(title, artist, 0, false );
    }

    public track(String title) {
        this(title, "Unknown artist", 0, false );
    }

    public track() {
        this("Unknown title", "Unknown artist", 0, false );
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public boolean getIsExplicit() {
        return isExplicit;
    }
    public void setIsExplicit(boolean isExplicit) {
        this.isExplicit = isExplicit;
    }


    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }


    @Override
    public String toString() {
        String result = "\" " + title + "by " + artist + getDurationFormatted() + getIsExplicit();
        if (this.isExplicit) {
            result += " (Explicit)";
        }
        return "";
    }

}
