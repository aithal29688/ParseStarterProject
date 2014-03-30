package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        Parse.initialize(this, "Asl6SeXop4myncFCshJTwJS6orOrJZzzdDkGdvPM", "VlajbnkfgHmTgNxucP0hM7LogWeZs5Xp5nb7BD2z");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

		ParseAnalytics.trackAppOpened(getIntent());
	}
}
