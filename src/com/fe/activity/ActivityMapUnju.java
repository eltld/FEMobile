package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
 /* import com.google.android.gms.maps.GoogleMap; */



import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


/**
 * Clase map base de la ubicacion de la
 * unju
 * @author  : David Garcia
 * @dateh   : 13-08-2014
 *
 */

public class ActivityMapUnju extends FragmentActivity implements OnInfoWindowClickListener{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityMapUnju.class);
	
	 private GoogleMap mMap;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_unju);
	    
		logger.debug("inicializar pagina mapa unju");
		//mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
	
		//mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();	
	}
	
	

	@Override
	public void onInfoWindowClick(Marker arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
