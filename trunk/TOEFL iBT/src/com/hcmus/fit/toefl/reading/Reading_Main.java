package com.hcmus.fit.toefl.reading;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.hcmus.fit.toefl.R;

public class Reading_Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reading_main2);
	}  
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
		startActivity(new Intent(this, Reading_Practice.class)); 
	}
}
