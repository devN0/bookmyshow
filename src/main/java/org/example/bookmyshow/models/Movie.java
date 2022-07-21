package org.example.bookmyshow.models;

import java.time.Duration;

public class Movie extends BaseModel {
    private String title;
    private Cast cast;
    private Duration length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }
}
