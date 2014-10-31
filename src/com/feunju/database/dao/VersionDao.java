package com.feunju.database.dao;

import java.util.ArrayList;

import junit.runner.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.SyncStateContract.Constants;

import com.feunju.database.helper.ComedorDbHelper;
import com.feunju.database.helper.ConstantDatabase;
import com.feunju.model.Comedor;
import com.feunju.model.Noticia;
import com.feunju.model.VersionApp;
import com.feunju.model.constant.ConstantRest;

public class VersionDao {

	
	

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ComedorDao.class);
	
	  
	
	
	private GenericDAO genericDao;
	private VersionApp versionApp;
	
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.APP_ID,
    		            ConstantDatabase.APP_VERSION};
    
 
	
   GenericDAO dao;
	public VersionDao(Context ctx)
	{
		
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_APPLICATION, 
				ConstantDatabase.T_APP,
				ConstantDatabase.DATABASE_VERSION);
		versionApp=new VersionApp();
		
	}
	
	
	public void add(VersionApp obj)
	{
		System.out.println("Insert version App");
		if(dao!=null)
		{

			logger.debug("Insert App: "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.APP_VERSION, obj.getVersionApp());
			values.put(ConstantDatabase.APP_ID, obj.getVersionId());
			dao.insert(ConstantDatabase.T_APP, values);
			
		}
		
		
		
	}
	
	
	
	public void del(String id)
	{
		
	}
	
	public ArrayList<Comedor> getAll()
	{
		
		return null;
	}


	public VersionApp get(Long id) {
		
		cursor=dao.get(ConstantDatabase.T_APP,this.columns,ConstantDatabase.APP_ID,id);
		
	   try
		{
		if(cursor!=null)
		{
	     int app_id =cursor.getColumnIndex(ConstantDatabase.APP_ID);
	     int app_version=cursor.getColumnIndex(ConstantDatabase.APP_VERSION);
	     
	     logger.debug("UniversitiyDao : api_id=> "+app_id+"  lat => "+app_version);
	     
	     versionApp=new VersionApp();
	     versionApp.setVersionId(Long.parseLong(cursor.getString(app_id)));
	     versionApp.setVersionApp(Long.parseLong(cursor.getString(app_version)));
	          
	     cursor.close();
	     return versionApp;
		}
		
		}catch(Exception ex)
		{    versionApp=null;
             return null;			
		}
	return versionApp;

	}	
	
	
	public void update(VersionApp obj)
	{
		
		logger.debug("Update App: "+obj.toString());
		ContentValues values=new ContentValues();
		values.put(ConstantDatabase.APP_VERSION, obj.getVersionApp());
		values.put(ConstantDatabase.APP_ID, obj.getVersionId());
		 
		dao.update(ConstantDatabase.T_APP,ConstantDatabase.APP_ID, obj.getVersionId(), values);
	}
	
	
	
}
