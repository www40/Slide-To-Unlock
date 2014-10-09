Slide-To-Unlock
===============

Android library to easily implement a slide to unlock feature.

![alt tag](http://i.imgur.com/7d00wi8.png)

Usage:

1. Add to your layout:

<com.hamondigital.unlock.UnlockBar
    	android:id="@+id/unlock"
    	android:layout_width="match_parent"
    	android:layout_height="wrap_content" />
    		
2. Implement `OnUnlockListener` into your Activity:

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
		
See TestActivity for a complete sample.
