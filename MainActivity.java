package com.example.patrick.aninterface;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity{

    MyReceiver myReceiver;
    IntentFilter intentFilter;
    TextView etReceivedBroadcast;
    Button btnSendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etReceivedBroadcast = (TextView) findViewById(R.id.etReceivedBroadcastView);

        //Passa a referencia para podermos imprimir nesta interface o resultado.
        MyApplication myApplication = (MyApplication) this.getApplicationContext();
        myApplication.mainActivity = this;

        myReceiver = new MyReceiver();
    }

}
