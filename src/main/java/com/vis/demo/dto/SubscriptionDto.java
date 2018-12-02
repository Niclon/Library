//package com.vis.demo.dto;
//
//public class SubscriptionDto {
//    private String bookId;
//
//    public SubscriptionDto() {
//    }
//
//    public SubscriptionDto(String bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(String bookId) {
//        this.bookId = bookId;
//    }
//}

package com.vis.demo.dto;

public class SubscriptionDto {
    private long bookId;

    public SubscriptionDto() {
    }

    public SubscriptionDto(long bookId) {
        this.bookId = bookId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
