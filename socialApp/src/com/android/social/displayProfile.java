package com.android.social;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displayProfile extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Intent i=getIntent();
        String s1=(String)i.getSerializableExtra("FirstName");
        TextView firstName=(TextView)findViewById(R.id.firstName);
        firstName.setText(s1);
        
        String s2=(String)i.getSerializableExtra("LastName");
        TextView lastName=(TextView)findViewById(R.id.lastName);
        lastName.setText(s2);
        
        String s3=(String)i.getSerializableExtra("EmailId");
        TextView emailId=(TextView)findViewById(R.id.emailId);
        emailId.setText(s3);
        
        String s4=(String)i.getSerializableExtra("BirthDate");
        TextView birthDate=(TextView)findViewById(R.id.birthDate);
        birthDate.setText(s4);
        
        String s5=(String)i.getSerializableExtra("gender");
        TextView gender=(TextView)findViewById(R.id.gender);
        gender.setText(s5);
        TextView phone=(TextView)findViewById(R.id.phone);
		ArrayList<String> result1=new ArrayList<String>();
        result1=i.getExtras().getStringArrayList("phone");
        String s="";
        for(int j=0;j<result1.size();j++)
        {
        	if(result1.get(j)!=null)
        	{
        		s=s + result1.get(j)+ " ";
        	}
        	 
        }
        phone.setText(s);
  
        
	}

}
