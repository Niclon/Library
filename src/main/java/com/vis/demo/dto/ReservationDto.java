package com.vis.demo.dto;

public class ReservationDto {
    private long bookId;

    public ReservationDto() {
    }

    public ReservationDto(long bookId) {
        this.bookId = bookId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
