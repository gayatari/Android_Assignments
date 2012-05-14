package com.android.listdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends ArrayAdapter<String> {
	
	Context context;
    int layoutResourceId;   
    String user[] = null;
    
	public myAdapter(Context context, int layoutResourceId, String[] user) {
        super(context, layoutResourceId, user);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.user = user;
    }
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		TextView Name = (TextView) rowView.findViewById(R.id.userName);
		TextView age = (TextView) rowView.findViewById(R.id.userAge);
		Name.setText(user[position]);
		//age.setText(user[position]);
		
		return rowView;
	}
	
}
