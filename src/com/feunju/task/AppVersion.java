package com.feunju.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.feunju.model.constant.ConstantRest;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class AppVersion {

	
	public AppVersion()
	{
		
		
		
	}
	
	public  int getVersionCode(Context context) {
		   PackageManager pm = context.getPackageManager();
		   try {
		      PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
		      return pi.versionCode;
		   } catch (NameNotFoundException ex) {}
		   return 0;
		}
	
	
	public String downloadText() {
		   int BUFFER_SIZE = 2000;
		   InputStream in = null;
		   try {
		      in = openHttpConnection();
		   } catch (IOException e1) {
		      return "";
		   }

		   String str = "";
		   if (in != null) {
		      InputStreamReader isr = new InputStreamReader(in);
		      int charRead;
		      char[] inputBuffer = new char[BUFFER_SIZE];
		      try {
		         while ((charRead = isr.read(inputBuffer)) > 0) {
		            // ---convert the chars to a String---
		            String readString = String.copyValueOf(inputBuffer, 0, charRead);
		            str += readString;
		            inputBuffer = new char[BUFFER_SIZE];
		         }
		         in.close();
		      } catch (IOException e) {
		         return "";
		      }
		   }
		   return str;
		}
	
	
	private  InputStream openHttpConnection() throws IOException {
	    InputStream in = null;
	    int response = -1;

	    URL url = new URL(ConstantRest.URL_VERSION_FILE);
	    URLConnection conn = url.openConnection();

	    if (!(conn instanceof HttpURLConnection))
	        throw new IOException("Not an HTTP connection");

	    try {
	        HttpURLConnection httpConn = (HttpURLConnection) conn;
	        httpConn.setAllowUserInteraction(false);
	        httpConn.setInstanceFollowRedirects(true);
	        httpConn.setRequestMethod("GET");
	        httpConn.connect();

	        response = httpConn.getResponseCode();
	        if (response == HttpURLConnection.HTTP_OK) {
	            in = httpConn.getInputStream();
	        }
	    } catch (Exception ex) {
	        throw new IOException("Error connecting");
	    }
	    return in;
	}
	
}
