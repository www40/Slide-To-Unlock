package com.hamondigital.unlock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.hamondigital.unlock.UnlockBar.OnUnlockListener;

public class TestActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		// Attach layout
		setContentView(R.layout.unlock_test);
		
		// Retrieve layout elements
		UnlockBar unlock = (UnlockBar) findViewById(R.id.unlock);
		
		// Attach listener
		unlock.setOnUnlockListener(new OnUnlockListener() {
			@Override
			public void onUnlock()
			{
				Toast.makeText(TestActivity.this, "You've successfully unlocked it !", Toast.LENGTH_LONG).show();
			}
		});
	}
}
