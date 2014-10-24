package com.feunju.bean;

import android.content.Context;

import com.feunju.database.helper.ActivityDbHelper;

public class DatabaseBean {
  
	//Database
	ActivityDbHelper dbHelper;
	public DatabaseBean(Context ctx)
	{
		dbHelper=new ActivityDbHelper(ctx);
	}
}
