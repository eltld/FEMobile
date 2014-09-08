package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
 /* import com.google.android.gms.maps.GoogleMap; */



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;


/**
 * Clase map base de la ubicacion de la
 * unju
 * @author  : David Garcia
 * @dateh   : 13-08-2014
 *
 */

public class ActivityMapUnju extends FragmentActivity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityMapUnju.class);
	
	 private GoogleMap mMap;
	 private Marker customMarker;
	 private LatLng markerLatLng;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_unju);
	    
		mMap= ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
	                .getMap();
   
		markerLatLng = new LatLng(-24.185538, -65.309447);
		
		
		
		
		setUpMapIfNeeded();
	
	}
	
	
	private void setUpMapIfNeeded() {
		// Do a null check to confirm that we have not already instantiated the
		// map.
		if (mMap == null) {
			System.out.println("map is null");
			// Try to obtain the map from the SupportMapFragment.
			mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
			// Check if we were successful in obtaining the map.
			if (mMap != null) {
				//setUpMap();
		
				googleMap.setOnCameraChangeListener(new OnCameraChangeListener() {
		             
				     public void onCameraChange(CameraPosition arg0) {
				    googleMap.animateCamera(CameraUpdateFactory.zoomTo(8));
				        googleMap.setOnCameraChangeListener(YourMapActivity.this);
				      }
				});
				 
                // Creating an instance of MarkerOptions
                MarkerOptions markerOptions = new MarkerOptions();
 
                // Setting position for the marker
                markerOptions.position(markerLatLng);
 
                // Setting custom icon for the marker
                markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker_rojo));
 
                // Setting title for the infowindow
                markerOptions.title("Universidad Nacional de Jujuy");
 
                // Adding the marker to the map
                mMap.addMarker(markerOptions);
                System.out.println("marker Options");
                
               /* mMap.setInfoWindowAdapter(new  InfoWindowAdapter() {
					
					@Override
					public View getInfoWindow(Marker marker) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public View getInfoContents(Marker marker) {
						 View myContentsView = getLayoutInflater().inflate(R.layout.map_marker_single, null);
			                TextView tvTitle = ((TextView)myContentsView.findViewById(R.id.title));
			                   tvTitle.setText(marker.getTitle());
			                   TextView tvSnippet = ((TextView)myContentsView.findViewById(R.id.snippet));
			                   tvSnippet.setText(marker.getSnippet());
			               return myContentsView;
					}
				});*/
			
			}
		}
	}
	
	/*private void setUpMap() {
		 
		View marker = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.map_marker_single, null);
		TextView numTxt = (TextView) marker.findViewById(R.id.num_txt);
		numTxt.setText("27");
 
		customMarker = mMap.addMarker(new MarkerOptions()
		.position(markerLatLng)
		.title("Title")
		.snippet("Description")
		.icon(BitmapDescriptorFactory.fromBitmap(createDrawableFromView(this, marker))));
 
		final View mapView = getSupportFragmentManager().findFragmentById(R.id.map).getView();
		
	}
 
	// Convert a view to bitmap
	public static Bitmap createDrawableFromView(Context context, View view) {
		DisplayMetrics displayMetrics = new DisplayMetrics();
		((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		view.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
		view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
		view.buildDrawingCache();
		Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
 
		Canvas canvas = new Canvas(bitmap);
		view.draw(canvas);
 
		return bitmap;
	}
	*/

	
}
