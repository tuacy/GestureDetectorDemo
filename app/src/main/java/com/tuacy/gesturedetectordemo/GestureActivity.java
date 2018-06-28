package com.tuacy.gesturedetectordemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class GestureActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, GestureActivity.class));
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gesture);
	}
}
