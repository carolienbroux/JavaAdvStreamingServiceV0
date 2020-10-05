package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static int LONG_PLAYING_TIME = 150;



    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration < 0){
            duration = -duration;
        }
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getTitle());
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this.getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + "\nMovie{" +
                "director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", genre=" + genre +
                '}';
    }

    public boolean isLongPlayingTime() {
        boolean longPlayTime = false;
        if(duration >= LONG_PLAYING_TIME){
            longPlayTime = true;
        }
        return longPlayTime;
    }

    /* @Override
    public String toString(){
        if(releaseDate == null){
            return this.title;
        }else{
            return title + " (" + this.releaseDate.getYear() + ") " ;
        }
    }*/

}
