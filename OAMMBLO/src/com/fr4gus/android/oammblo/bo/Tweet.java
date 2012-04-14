package com.fr4gus.android.oammblo.bo;

public class Tweet {

    private long timestamp;

    private String author;

    private String message;

    
    public Tweet(long timestamp, String author, String message){
        this.timestamp = timestamp;
        this.author = author;
        this.message = message;
    }
    
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
