package com.fr4gus.android.oammblo.ui;

import android.os.Bundle;

import com.fr4gus.android.oammblo.R;


/**
 * Dashboard Activity class. All activities on this application should inherit from OammbloActivity
 * 
 * @author Daniel Feldman
 * Created Apr 2, 2012
 */
public class DashboardActivity extends OammbloActivity{
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);               
                      
    }
}
