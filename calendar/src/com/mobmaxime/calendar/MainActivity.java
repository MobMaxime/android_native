package com.mobmaxime.calendar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	CalendarView calendar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initializeCalendar();
	}

	@SuppressLint("NewApi")
	private void initializeCalendar() {
		// TODO Auto-generated method stub
		calendar = (CalendarView) findViewById(R.id.calendar);

		calendar.setShowWeekNumber(false);

		calendar.setFirstDayOfWeek(2);

		calendar.setSelectedWeekBackgroundColor(getResources().getColor(
				R.color.green));

		calendar.setUnfocusedMonthDateColor(getResources().getColor(
				R.color.transparent));

		calendar.setWeekSeparatorLineColor(getResources().getColor(
				R.color.transparent));

		calendar.setSelectedDateVerticalBar(R.color.darkgreen);

		calendar.setOnDateChangeListener(new OnDateChangeListener() {
			public void onSelectedDayChange(CalendarView view, int year,
					int month, int day) {
				Toast.makeText(getApplicationContext(),
						day + "/" + month + "/" + year, Toast.LENGTH_LONG)
						.show();
			}
		});

	}

}
