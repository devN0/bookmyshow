package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.SeatStatus;

public class Seat extends BaseModel {
    private String seatNumber;
    private SeatType seatType;
    private Auditorium auditorium;
//    status of a seat doesn't make sense instead status should be of a ShowSeat.
//    private SeatStatus seatStatus;

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }
}
