package com.taruc.implicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare views
    private Button buttonSend, buttonView, buttonCall, buttonHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind views with UI
        buttonCall = findViewById(R.id.buttonCall);
        buttonView = findViewById(R.id.buttonView);
        buttonHome = findViewById(R.id.buttonHome);
        buttonSend = findViewById(R.id.buttonSend);

        //define function

    }
}
