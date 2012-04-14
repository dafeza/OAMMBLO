package com.fr4gus.android.oammblo.data;

/**
 * 
 * @author Franklin Garcia
 *
 */
public class TwitterServiceFactory {
    
    public static enum Provider {
        DUMMY,
        TWITTER4J,
    }

    public static TwitterService getService(Provider provider) {
        TwitterService service = null;
        switch (provider) {
        case DUMMY:
            return new DummyTwitterService();
        case TWITTER4J:
            return new Twitter4JService();
        default:
            break;
        }
        return service;
    }
}
