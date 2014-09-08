package com.fe.database.helper;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ComedorDbHelper extends SQLiteOpenHelper {

    private static SQLiteDatabase db ;
	private static String QUERY_CREATE_COMEDOR;
    private static String QUERY_DROP_COMEDOR;
	
	public ComedorDbHelper(Context context) {
		super(context, ConstantDatabase.DATABASE_NAME, null, ConstantDatabase.DATABASE_VERSION);
		
		db = this.getWritableDatabase();
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		 System.out.println("onCreate ComedorDbHelper");
		 db.execSQL(QUERY_CREATE_COMEDOR);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		System.out.println("onUpgrade ComedorDbHelper");
		db.execSQL(QUERY_DROP_COMEDOR);
        onCreate(db);
	}
	
	@SuppressLint("Override")
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	        onUpgrade(db, oldVersion, newVersion);
	}

	public long insert(String table, ContentValues values){
		System.out.println("insert comedorDbHelper");
		if(db.isOpen())	
		  { System.out.print("Db Helper is open database");
			return db.insert(table, null, values);
		  }
		else 
		{ System.out.println("DbHelpernot open database");
			return 0;
		}
	}
    
    public Cursor get(String table, String[] columns){
        return db.query(table, columns, null, null, null, null, null);
    }
    
    public Cursor get(String table, String[] columns,String columnSearch ,long id){
        Cursor cursor =db.query(true, table, columns, columnSearch + "=" + id, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }
    
    public int delete(String table) {
        return db.delete(table, "1", null);
    }
    
    /*public int delete(String table, long id) {
        return db.delete(table, KEY_ID + "=" + id, null);
    }
    
    public int update(String table, long id, ContentValues values) {
        return db.update(table, values, KEY_ID + "=" + id, null);
    }
	*/

	
}
