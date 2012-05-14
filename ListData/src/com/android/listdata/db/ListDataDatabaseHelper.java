package com.android.listdata.db;


import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ListDataDatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "dbListData";
	private static final int DATABASE_VERSION = 1;

	public ListDataDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		try {
			String createSql = "CREATE TABLE Users (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "Age INTEGER	 , "
					+ "name TEXT );";
			Log.v("ListData", "########Creating Users: " + createSql);
			db.execSQL(createSql);
			
			createSql = null;
			createSql = "CREATE TABLE User_data (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "age INTEGER	 , "
					+ "name TEXT , "
					+ "gender TEXT, "
					+ "emailId TEXT );";
			Log.v("ListData", "########Creating Users_data: " + createSql);
			db.execSQL(createSql);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.e("POLS2", "##############db creation failed: " + e.getMessage());
		}

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w("POLS2", "Upgrading database from version " + oldVersion + " to "
				+ newVersion + ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS victories");
		onCreate(db);
	}
}
