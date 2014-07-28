package com.fe;

import java.util.ArrayList;

import com.fe.bean.ItemGrid;
import com.fe.bean.adapter.GridAdapterPrincipal;
import com.fe.bean.util.ListItemGrid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {

	  GridView gridView;
	  ArrayList<ItemGrid> listItemGrid=new ArrayList<ItemGrid>();
	  //adapter principal
	  GridAdapterPrincipal gridAdapterPrincipal;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//load content 
		gridView=(GridView)findViewById(R.id.grid_principal);
		listItemGrid=(ArrayList<ItemGrid>) ListItemGrid.loadItemGridPrincipal(this.getResources());
	    gridAdapterPrincipal=new GridAdapterPrincipal(this, R.layout.grid_single_principal, listItemGrid);
	    gridView.setAdapter(gridAdapterPrincipal);
	}

	

}
