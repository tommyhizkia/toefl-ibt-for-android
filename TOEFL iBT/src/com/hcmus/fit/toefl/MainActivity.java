package com.hcmus.fit.toefl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static final int STOPSPLASH = 0;
	// time in milliseconds
	private static final long SPLASHTIME = 3000;
	private ImageView splash;

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		splash = (ImageView) findViewById(R.id.imgMainCover);

		Message msg = new Message();
		msg.what = STOPSPLASH;
		try {
			splashHandler.sendMessageDelayed(msg, SPLASHTIME);
		} catch (Exception e) {
		}
	}

	private Handler splashHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case STOPSPLASH:
				// remove SplashScreen from view
				splash.setVisibility(View.GONE);
				startMain();
			}
			super.handleMessage(msg);
		}
	};

	private void startMain() {
		startActivity(new Intent(this, MainScreen.class));
		overridePendingTransition(R.anim.scaleup, R.anim.scaledown);
		finish();
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