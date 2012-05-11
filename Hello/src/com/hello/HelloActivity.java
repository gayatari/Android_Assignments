package com.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends Activity {
    /** Called when the activity is first created. */
	 EditText editView;
	 TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        
        textView=(TextView)findViewById(R.id.textView);
        editView=(EditText)findViewById(R.id.editView);
        Button buttonClick=(Button)findViewById(R.id.buttonClick);
        
        buttonClick.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String string="Hey "+ editView.getText().toString()+ " Welcome to Mobile Team";
				textView.setText(string);
				Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();
			}
		} );
    }
}