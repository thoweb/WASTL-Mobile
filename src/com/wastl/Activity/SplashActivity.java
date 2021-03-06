package com.wastl.Activity;

import com.ithtl.essapp.R;
import com.wastl.WastlStatus;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.RelativeLayout;

/**
 * Defines the splash screen. Downloads the global XML file and fills the district map.
 * 
 * @author Lukas Bernreiter
 * @version 1.2.2, 04/03/2012
 * @since 1.2.1
 */
public class SplashActivity extends Activity implements Runnable {

	private WastlStatus mStatus = null;
	private Thread mSplash 		= null;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		/* Set and start the transition for the splash screen */
		RelativeLayout rLayout = (RelativeLayout) this.findViewById(R.id.rLayout_Splash);
		rLayout.setBackgroundResource(R.drawable.splash_transition);
		((TransitionDrawable)rLayout.getBackground()).startTransition(5000);
		
		this.initializeObjects();
	}
	
	private void initializeObjects()
	{
		this.mSplash = new Thread(this);
		this.mSplash.start();
	}
	
	public void run() {
		synchronized (this) {
			mStatus = new WastlStatus();
			mStatus.refreshStatus();
			
			// When finished start the main activity
			startActivity(new Intent(SplashActivity.this,MainActivity.class));
			finish();
		}
	}
	
}