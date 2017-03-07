package com.example.mutithread;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void one(View v){
		Intent intent = new Intent(MainActivity.this, MainActivity1.class);
		startActivity(intent);
	}
	
	public void two(View v){
		Intent intent = new Intent(MainActivity.this, MainActivity2.class);
		startActivity(intent);
	}
	
	public void three(View v){
		Intent intent = new Intent(MainActivity.this, MainActivity3.class);
		startActivity(intent);
	}

}
