package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(7),
    OLDER_KIDS(12),
    TEENS(16),
    MATURE(999);

    private int minimumAge;

    Rating(int leeftijd){
        this.minimumAge = leeftijd;
    }
}
