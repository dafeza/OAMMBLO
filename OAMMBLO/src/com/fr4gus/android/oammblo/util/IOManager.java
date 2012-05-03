package com.fr4gus.android.oammblo.util;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;

public class IOManager {
		
	
	//Obtiene la imagen del URL y la guarda en el SD.
	public static Bitmap getBitmapFromURL(URL url) {
		HttpURLConnection urlConnection = null;
		Bitmap result = null;
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
			InputStream in = new BufferedInputStream(urlConnection.getInputStream());			
			result = BitmapFactory.decodeStream(in);
		}
		catch(Exception e) {
			LogIt.d(e, e.getMessage());
		}
    	finally {
    		urlConnection.disconnect();
    	}
		return result;		
	}
}
