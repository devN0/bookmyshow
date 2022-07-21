package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.SeatStatus;

public class ShowSeat extends BaseModel {
    private Show show;
    private Seat seat;

//    Since typically for a Show based on the SeatType, price is calculated. So we can save up some space by storing price for every SeatType
//    in ShowSeatType instead of storing price for every seat in ShowSeat.
//    private float price;
    private SeatStatus seatStatus;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
