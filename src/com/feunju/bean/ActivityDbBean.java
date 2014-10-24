package com.feunju.bean;

import java.util.ArrayList;

import android.content.Context;

import com.feunju.bean.util.UtilList;
import com.feunju.database.helper.ActivityDbHelper;
import com.feunju.model.Secretaria;


/**
 * Clase Base 
 * @author David Garcia
 * @Dathe  7-8-2014
 *
 */
public class ActivityDbBean {
  
   private ActivityDbHelper dbHelper;
   public ActivityDbBean(Context ctx) 
	{
		dbHelper= new ActivityDbHelper(ctx);
	}
	
	


}
