package com.android.listdata;

import com.android.listdata.db.DbAdapter;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class list extends ListActivity{
	
	
	DbAdapter db;
	DbAdapter db2;

	String Name;
	String age;
	public static final String ROWID = "_id";
	public static final String name = "name";
	public static final String Age = "age";
	public static final String gender = "gender";
	public static final String emailId = "emailId";
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	
	
    db=new DbAdapter(this,"Users") {
		
		@Override
		protected void setDbName() {
			// TODO Auto-generated method stub
			this.dbName = "Users";
			Log.i("DB Name Set", dbName);
		}
		
		@Override
		protected void setDbColumns() {
			// TODO Auto-generated method stub
			this.dbColumns = new String[] { "_id", name, Age};
			Log.i("Db Comolmn Set", dbColumns.toString());
		}
	};
	db2=new DbAdapter(this,"Users_data") {
		
		@Override
		protected void setDbName() {
			// TODO Auto-generated method stub
			this.dbName = "Users_data";
			Log.i("DB Name Set", dbName);
		}
		
		@Override
		protected void setDbColumns() {
			// TODO Auto-generated method stub
			this.dbColumns = new String[] { "_id", age,name,gender,emailId};
			Log.i("Db Comolmn Set", dbColumns.toString());
		}
	};
	Intent i=getIntent();
	Name=(String)i.getSerializableExtra("Name");
	age=(String)i.getSerializableExtra("age");
    String user_data[] = new String[]{Name,age};
    
  myAdapter adapter = new myAdapter(this, R.layout.list_item, user_data);
 
  ListView listView = getListView();
  listView.setAdapter(adapter);
 	listView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			ContentValues values= new ContentValues();
			values.put("age", age);
			values.put("name", Name);
			db.create(values);
		   // Cursor c= db2.fetch(name);
		  Cursor c= db.fetchAll(name, age);
		  
		    	 
		    	

				}

		
		
		
	});
	
 
}

}
