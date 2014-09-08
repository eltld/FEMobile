package com.fe.bean;

import android.content.Context;

import com.fe.database.helper.ActivityDbHelper;

public class DatabaseBean {
  
	//Database
	ActivityDbHelper dbHelper;
	public DatabaseBean(Context ctx)
	{
		dbHelper=new ActivityDbHelper(ctx);
	}
}
