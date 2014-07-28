package com.fe;

import java.util.ArrayList;

import com.fe.bean.ItemGrid;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.util.ListItemGrid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;



/**
 * Clase inicial de la aplicacion 
 * se implementara 
 * @author manuonda
 *
 */
public class MainActivity extends Activity  implements OnItemClickListener {

	  GridView gridView;
	  ArrayList<ItemGrid> listItemGridImage=new ArrayList<ItemGrid>();
	  //adapter principal
	  CustomGridAdapter gridAdapterPrincipal;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//load content 
		gridView=(GridView)findViewById(R.id.grid_principal);
		//load listItemGridImages
		listItemGridImage=(ArrayList<ItemGrid>) ListItemGrid.loadItemGridPrincipal(this.getResources());
	    
		gridAdapterPrincipal=new CustomGridAdapter(this, R.layout.grid_single, listItemGridImage);
	    gridView.setAdapter(gridAdapterPrincipal);
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	

}
