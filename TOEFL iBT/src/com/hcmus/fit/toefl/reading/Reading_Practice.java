package com.hcmus.fit.toefl.reading;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hcmus.fit.toefl.R;


public class Reading_Practice extends ListActivity{

	String[] values = new String[]{
		"Practice 1", "Practice 2", "Practice 3", "Practice 4", "Practice 5"	
	};
	
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reading_listview);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		startActivity(new Intent(this, Reading_Main.class));
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		startActivity(new Intent(this, Reading_DangCauHoi.class));
	}
}
