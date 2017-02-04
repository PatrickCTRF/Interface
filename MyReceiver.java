package com.example.patrick.aninterface;

/**
 * Created by patrick on 12/14/16.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver{

    boolean isInHome;
    String dados;

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity mainActivity = ((MyApplication) context.getApplicationContext()).mainActivity;
        isInHome = intent.getBooleanExtra("HOME", false);
        dados = intent.getStringExtra("DADOS");
        mainActivity.etReceivedBroadcast.setText("\nbroadcast: "+intent.getAction()+"\nEstá na Home: " + isInHome + dados + "\n");

    }

    public MyReceiver() {
        this.isInHome = false;
        this.dados = null;
    }
}
