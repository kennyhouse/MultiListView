package com.example.multilistview;

import android.content.Context;
import android.widget.ArrayAdapter;

//change

public class MyPerformanceArrayAdapter extends ArrayAdapter{
	Context context;
	
	public MyPerformanceArrayAdapter(Context context, String[] values){
		super(context, R.layout.rowbuttonlayout, values);
	}
}