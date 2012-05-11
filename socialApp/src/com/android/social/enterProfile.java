package com.android.social;

import java.util.ArrayList;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class enterProfile extends Activity{
	
	EditText FirstName;
    EditText LastName;
    EditText EmailId;
    EditText BirthDate;
    EditText CollageName;
    EditText SchoolName;
    Button save;
    RadioButton radioSexButton;
    RadioGroup radioSexGroup;
    CheckBox chkIos, chkAndroid, chkWindows,chkBlackberry;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        
      
        FirstName=(EditText)findViewById(R.id.FirstName);
        LastName=(EditText)findViewById(R.id.LastName);
        EmailId=(EditText)findViewById(R.id.EmailId);
        BirthDate=(EditText)findViewById(R.id.BirthDate);
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        save=(Button)findViewById(R.id.Save);
      	      
        chkIos = (CheckBox) findViewById(R.id.chkIos);
    	chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
    	chkWindows = (CheckBox) findViewById(R.id.chkWindows);
    	chkBlackberry=(CheckBox) findViewById(R.id.chkBlackberry);
        save.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(getApplicationContext(),displayProfile.class);
				intent.putExtra("FirstName", FirstName.getText().toString());
				intent.putExtra("LastName", LastName.getText().toString());
				intent.putExtra("EmailId", EmailId.getText().toString());
				intent.putExtra("BirthDate", BirthDate.getText().toString());
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
				//find the radiobutton bnlk.y returned id
				 radioSexButton = (RadioButton) findViewById(selectedId);
				intent.putExtra("gender", radioSexButton.getText().toString());
				ArrayList<String> result=new ArrayList<String>();
				if(chkIos.isChecked())
				{
				  result.add("Ios");
				  			  
				}
				if(chkAndroid.isChecked())
				{
					result.add("Android");
				}
			    if (chkWindows.isChecked())
			    {
			    	result.add("Windows");
			    }
				if(chkBlackberry.isChecked())
				{
					result.add("BlackBerry");
				}
				
				intent.putStringArrayListExtra("phone", result);
				startActivity(intent);
			}
		});
        
        
	}
}
