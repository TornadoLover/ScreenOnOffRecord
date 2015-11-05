package com.tornado.screenonoffrecord;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Date;

public class receiverScreen extends BroadcastReceiver {
    public final static String TAG = "ScreenStatus";
    public TestFileOutputStream mTestFileOutputStream;
    public float power = 0;
 @Override

 public void onReceive(Context context, Intent intent) {
     if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
         mTestFileOutputStream = new TestFileOutputStream();
         //write in Log so we can see it directly when debuging
         Log.i(TAG, "-------------- on !");
         //store record data in the root derectory
         mTestFileOutputStream.TestWrite(new Date().toString() + " Screen ON!" + " " + power + "%" + "\n");
         //you can add other functions here
     }else if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
         Log.i(TAG, "-------------- off !");
         mTestFileOutputStream.TestWrite(new Date().toString() + " Screen OFF!"+" "+power+ "%" + "\n");
         //you can add other functions here
     }else if(Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())){
         //obtain the power percentage
         int level = intent.getIntExtra("level", 0);
         int scale = intent.getIntExtra("scale", 100);
         power = (level*100)/scale;
         Log.i("Power----------------",power + " ");
     }
 }
}
