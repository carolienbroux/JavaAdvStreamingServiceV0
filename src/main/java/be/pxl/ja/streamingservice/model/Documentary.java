package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie{
    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDocumentary{" +
                "topic='" + topic + '\'' +
                '}';
    }

    @Override
    public void pause() {
        System.out.println( "PAUSE " + this.getTitle());
    }

    @Override
    public void play() {
        System.out.println( "PLAY " + this.getTitle());
    }
}
