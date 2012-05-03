package com.fr4gus.android.oammblo.bo;

import java.net.URL;

public class Tweet {

    private long timestamp;

    private String author;

    private String message;
    
    private URL url;

    
    public Tweet(long timestamp, String author, String message, URL url){
        this.timestamp = timestamp;
        this.author = author;
        this.message = message;
        this.url = url;
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

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
    
    
}
