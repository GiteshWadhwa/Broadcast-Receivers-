package com.gitesh.wadhwa.mybroadcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast02 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Second Broadcast receiver",Toast.LENGTH_SHORT).show();
    }
}
