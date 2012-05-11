package com.android.social;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SocialAppActivity extends Activity {
    /** Called when the activity is first created. */
	 TextView textView_user;
	 TextView textView_pwd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView_user=(TextView)findViewById(R.id.textView_user);
        textView_pwd=(TextView)findViewById(R.id.editView_pwd);
        
        EditText editText_user=(EditText)findViewById(R.id.editView_user);
        EditText editText_pwd=(EditText)findViewById(R.id.editView_pwd);
        Button login=(Button)findViewById(R.id.Login);
        
        login.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-genhgnerated method stub
				Intent intent=new Intent(SocialAppActivity.this,enterProfile.class);
				
					 startActivity(intent);
				
								
			}
		});
        
        
    }
}