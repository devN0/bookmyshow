package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.AuditoriumType;

import java.util.List;

public class Auditorium extends BaseModel {
    private String name;
    private Theatre theatre;
    private AuditoriumType auditoriumType;
    private List<List<Seat>> seatStructure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public AuditoriumType getAuditoriumType() {
        return auditoriumType;
    }

    public void setAuditoriumType(AuditoriumType auditoriumType) {
        this.auditoriumType = auditoriumType;
    }

    public List<List<Seat>> getSeatStructure() {
        return seatStructure;
    }

    public void setSeatStructure(List<List<Seat>> seatStructure) {
        this.seatStructure = seatStructure;
    }
}
