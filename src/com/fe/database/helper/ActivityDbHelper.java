package com.fe.database.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.MainActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ActivityDbHelper extends SQLiteOpenHelper {

	private static SQLiteDatabase db ;
	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityDbHelper.class);
		
	public ActivityDbHelper(Context context) {
		super(context, ConstantDatabase.DATABASE_NAME, null, ConstantDatabase.DATABASE_VERSION);
		db=getReadableDatabase();
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	    logger.debug("Execute create sql");	
		db.execSQL(ConstantDatabase.QUERY_CREATE_NOTICIA);
		db.execSQL(ConstantDatabase.QUERY_CREATE_CARRERA);
		db.execSQL(ConstantDatabase.QUERY_CREATE_COMEDOR);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		logger.debug("Execute onUpgrade");
		onUpgrade(db, oldVersion, newVersion);
		db.execSQL(ConstantDatabase.QUERY_DROP_CARRERA);
		db.execSQL(ConstantDatabase.QUERY_DROP_NOTICIA);
		db.execSQL(ConstantDatabase.QUERY_DROP_COMEDOR);
        onCreate(db);
	}

	
	
}
