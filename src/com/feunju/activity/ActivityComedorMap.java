package com.feunju.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Dialog;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.widget.TextView;

import com.feunju.edu.R;
import com.feunju.model.constant.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityComedorMap  extends FragmentActivity implements LocationListener{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityComedorMap.class);
	
	 private GoogleMap mMap;
	 private Marker customMarker;
	 private LatLng markerLatLng;
	 private TextView text_header;
	 private String title;
	
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_unju);
	  
		
	  Intent intent=this.getIntent();
	  Double lat= Double.valueOf(intent.getStringExtra(Constants.COMEDOR_LAT));
	  Double lon= Double.valueOf(intent.getStringExtra(Constants.COMEDOR_LONG));
	  String title=intent.getStringExtra(Constants.COMEDOR_NOMBRE);	
	  
	  logger.info("activity comedor unju");
		
	  text_header=(TextView)findViewById(R.id.text_header);
	  text_header.setText(Html.fromHtml("Ubicación"));
		
		 // Getting Google Play availability status
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());
 
        // Showing status
        if(status!=ConnectionResult.SUCCESS){ // Google Play Services are not available
 
            int requestCode = 10;
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, this, requestCode);
            dialog.show();
 
        }else { // Google Play Services are available
 
        	  mMap= ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
	                .getMap();
   
        	   
		      markerLatLng = new LatLng(lat,lon); 
	
	          	setUpMapIfNeeded();
 
         
        }
		
       
	
	}
	
	
	private void setUpMapIfNeeded() {
		// Do a null check to confirm that we have not already instantiated the
		// map.
		if (mMap == null) {
			logger.info("map is null");
			logger.debug("maps is null");
			System.out.println("map is null");
			// Try to obtain the map from the SupportMapFragment.
			mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
			// Check if we were successful in obtaining the map.
			if (mMap != null) {
				addMarker(markerLatLng);
				   
			}
		}else
		{
			
			// Creating an instance of MarkerOptions
            addMarker(markerLatLng);
          
		
		}
	}


	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub
		 Location myLocation =mMap.getMyLocation();
         if( myLocation != null ){
             logger.debug( "Latitude: " + myLocation.getLatitude() + "\nLongitude: " + myLocation.getLongitude() );
         }  
	}


	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}
	

	
	private void addMarker(LatLng markerLatLng)
	{
		 logger.debug("map is not null");
	     mMap.setMyLocationEnabled(true);
         mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerLatLng, 14.0f));
    		
       	
	      // Creating an instance of MarkerOptions
          MarkerOptions markerOptions = new MarkerOptions();
          // Setting position for the marker
          markerOptions.position(markerLatLng);

          // Setting custom icon for the marker
          markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
          //markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker_rojo));

          // Setting title for the infowindow
          markerOptions.title(title);

          // Adding the marker to the map
          mMap.addMarker(markerOptions);
          System.out.println("marker Options");
	}
	
	
	private void locationManager()
	{
		
		   // Enabling MyLocation Layer of Google Map
        mMap.setMyLocationEnabled(true);

        // Getting LocationManager object from System Service LOCATION_SERVICE
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        // Creating a criteria object to retrieve provider
        Criteria criteria = new Criteria();

        // Getting the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);

        // Getting Current Location
        Location location = locationManager.getLastKnownLocation(provider);

        if(location!=null){
            onLocationChanged(location);
        }
        locationManager.requestLocationUpdates(provider, 20000, 0, this);
		
	}
	
}
