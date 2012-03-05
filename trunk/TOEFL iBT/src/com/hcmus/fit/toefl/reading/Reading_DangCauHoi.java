package com.hcmus.fit.toefl.reading;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hcmus.fit.toefl.MainScreen;
import com.hcmus.fit.toefl.R;

public class Reading_DangCauHoi extends ListActivity{

	String[] values = new String[]{
			"Factual Information Questions", "Negative Factual Information Questions",
			"Inference Questions", "Rhetorical Purpose Questions",
			"Vocabulary Questions", "Reference Questions",
			"Sentence  Simplification Questions", "Insert Text Questions",
			"Prose Summary Questions", "Fill in a Table Questions"
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
		startActivity(new Intent(this, Reading_Practice.class));
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		startActivity(new Intent(this, MainScreen.class));
	}
}
