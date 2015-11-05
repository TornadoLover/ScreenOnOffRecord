package com.tornado.screenonoffrecord;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class serviceScreen extends Service {

	 @Override
	 public IBinder onBind(Intent intent) {
	  return null;
	 }
 
	@Override
	 public void onStart(Intent intent, int startId) {
	     try {
	          IntentFilter filter = new IntentFilter();
	          filter.addAction(Intent.ACTION_SCREEN_ON);
	          filter.addAction(Intent.ACTION_SCREEN_OFF);
			  filter.addAction(Intent.ACTION_BATTERY_CHANGED);
	          BroadcastReceiver mReceiver = new receiverScreen();
	          registerReceiver(mReceiver, filter);
	     } catch (Exception e) {
	          Log.d("Tornado",e.toString());
	     }
	 }
}


