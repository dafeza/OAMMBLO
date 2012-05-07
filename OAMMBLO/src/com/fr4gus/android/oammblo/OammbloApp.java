package com.fr4gus.android.oammblo;

import com.fr4gus.android.oammblo.data.TwitterService;
import com.fr4gus.android.oammblo.data.TwitterServiceFactory;
import com.fr4gus.android.oammblo.data.TwitterServiceFactory.Provider;
import com.fr4gus.android.oammblo.util.ImageDownloader;

import android.app.Application;

public class OammbloApp extends Application {
	TwitterService twitterService;
	ImageDownloader imageDownloader; 
	static OammbloApp self;
	
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        twitterService = TwitterServiceFactory.getService(Provider.TWITTER4J);
        imageDownloader = new ImageDownloader();        		
        self = this;
    }

    @Override
    public void onLowMemory() {
        // TODO Auto-generated method stub
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        // TODO Auto-generated method stub
        super.onTerminate();
    }
    
    public TwitterService getTwitterService() {
        return twitterService;
    }
    
    public ImageDownloader getImageDownloader() {
        return imageDownloader;
    }

    public static OammbloApp getInstance() {
        return self;
    }

}
