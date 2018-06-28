package com.tuacy.gesturedetectordemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.button_gesture).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				GestureActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_scale_gesture).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ScaleGestureActivity.startUp(mContext);
			}
		});
	}
}
