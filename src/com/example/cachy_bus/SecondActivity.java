package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView result;
	TextView result1;
	TextView result2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		result = (TextView) findViewById(R.id.text2);
		result1 = (TextView) findViewById(R.id.text_3);
		result2 = (TextView) findViewById(R.id.text4);
		Typeface tfont = Typeface.createFromAsset(getAssets(),
				"SourceSansPro-SemiboldIt.otf");
		Typeface t1font = Typeface.createFromAsset(getAssets(),
				"SourceSansPro-SemiboldIt.otf");
		Typeface t2font = Typeface.createFromAsset(getAssets(),
				"SourceSansPro-SemiboldIt.otf");
		Intent i = getIntent();
		String datafrmMain = i.getStringExtra("username");
		result.setTypeface(tfont);
		result.setText("Hai " + datafrmMain);
		result1.setTypeface(t1font);
		result1.setText("Hello " + datafrmMain);
		result2.setTypeface(t2font);
		result2.setText("Welcome " + datafrmMain);

	}

}
