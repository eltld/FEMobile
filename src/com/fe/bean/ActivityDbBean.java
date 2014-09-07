package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.bean.util.UtilList;
import com.fe.database.helper.ActivityDbHelper;
import com.fe.model.Secretaria;


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
