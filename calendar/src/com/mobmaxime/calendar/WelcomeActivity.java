package com.mobmaxime.calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
	}

	public void sample_one_click(View v) {

		Intent calendarview = new Intent(this, MainActivity.class);
		startActivity(calendarview);
	}

	public void sample_second_click(View v) {
		Intent dynamicActivity = new Intent(this, dynamicActivity.class);
		startActivity(dynamicActivity);
	}
}