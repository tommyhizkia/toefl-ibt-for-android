package com.hcmus.fit.toefl;


import com.hcmus.fit.toefl.reading.Reading_DangCauHoi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.*;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainScreen extends Activity{
	
	@Override
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linear_mainscreen);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
		Intent newIntent = new Intent(this, MainActivity.class);
		startActivity(newIntent);
    	overridePendingTransition(R.anim.scaledown, R.anim.scaleup);
	}
	
	public void showReading (View clickedImageButton){
//		Toast.makeText(
//				getBaseContext(), 
//				"Reading", 
//				Toast.LENGTH_SHORT).show();
		//goToActivity(Reading_Login.class);
		startActivity(new Intent(this, Reading_DangCauHoi.class));
	}
	
	public void showSpeaking(View clickedImageButton) {
		Toast.makeText(
				getBaseContext(), 
				"Speaking", 
				Toast.LENGTH_SHORT).show();
	}
	
	public void showListening(View clickedImageButton) {
		Toast.makeText(
				getBaseContext(), 
				"Listening", 
				Toast.LENGTH_SHORT).show();
	}
	
	public void showWriting(View clickedImageButton) {
		Toast.makeText(
				getBaseContext(), 
				"Writing", 
				Toast.LENGTH_SHORT).show();
	}
	
}
