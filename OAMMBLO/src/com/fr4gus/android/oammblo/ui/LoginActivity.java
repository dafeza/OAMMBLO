package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * Login Activity class. All activities on this application should inherit from OammbloActivity
 * 
 * @author Daniel Feldman
 * Created Mar 31, 2012
 */
public class LoginActivity extends OammbloActivity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);                                      
    }
	
	public void openDashboard(View view){
		Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(intent);
	}
}
