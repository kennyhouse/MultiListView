package com.example.multilistview;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class MultiListViewActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_multi_list_view);
		String[] values = new String[]{"Linux", "Windows7", "Suse", "Eclipse", "Ubuntu", "Solaris", "Android", "Iphone"};
		
		MyPerformanceArrayAdapter adapter = new MyPerformanceArrayAdapter(this, values);
		setListAdapter(adapter);

			
		
	}

	

}
