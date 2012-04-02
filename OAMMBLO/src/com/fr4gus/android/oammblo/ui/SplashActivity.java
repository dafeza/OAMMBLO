package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;
import java.lang.Thread;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        openLogin();
    }
    
    private void openLogin(){
    	Thread thread = new Thread()
    	{
    	    @Override
    	    public void run() {
    	        try {
    	            
	                sleep(2000);
	                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
	                startActivity(intent);	                	                
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }    	       
    	    }
    	};

    	thread.start();
    	
    }
    

}
