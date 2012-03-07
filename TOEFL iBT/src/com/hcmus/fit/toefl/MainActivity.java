package com.hcmus.fit.toefl;

import com.hcmus.fit.toefl.database.MyDB;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.animation.*;
import android.content.Intent;

public class MainActivity extends Activity {

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	// @Override
	// public boolean onTouchEvent(MotionEvent event) {
	// // TODO Auto-generated method stub
	// Intent newIntent = new Intent(this, MainScreen.class);
	// startActivity(newIntent);
	// overridePendingTransition(R.anim.scaleup, R.anim.scaledown);
	// return super.onTouchEvent(event);
	// }
}