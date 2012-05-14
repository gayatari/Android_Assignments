package com.android.listdata;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class ListDataActivity extends Activity {
    /** Called when the activity is first created. */
	EditText Name;
	EditText age;
	myAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Name=(EditText)findViewById(R.id.Name);
	     age=(EditText)findViewById(R.id.Age);
	     Button show=(Button)findViewById(R.id.show);
	    
	   show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getApplicationContext(), list.class);
				intent.putExtra("Name", Name.getText().toString());
				intent.putExtra("age", age.getText().toString());
				startActivity(intent);
				
			   
			    
				
			}
		});
    }
}