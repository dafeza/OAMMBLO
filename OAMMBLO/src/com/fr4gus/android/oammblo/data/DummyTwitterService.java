package com.fr4gus.android.oammblo.data;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.net.Uri;

import com.fr4gus.android.oammblo.bo.Tweet;

public class DummyTwitterService implements TwitterService {

    List<Tweet> timeline = new LinkedList<Tweet>();
    
    public DummyTwitterService() {
        
        timeline.add( new Tweet(System.currentTimeMillis(), "fr4gus", "Este es un mensaje de prueba"));
        timeline.add( new Tweet(System.currentTimeMillis(), "fr4gus", "Probando Oamblo"));
        timeline.add( new Tweet(System.currentTimeMillis(), "fr4gus", "Tweet tweet como el pajarito azul"));
    }
    
    @Override
    public List<Tweet> getTimeline() {
        // TODO Auto-generated method stub
        return timeline;
    }

    @Override
    public boolean checkForSavedLogin(Context ctx) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void requestOAuthAccessToken(Context ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean authorize(Context context, Uri uriData) {
        return true;
    }

}
