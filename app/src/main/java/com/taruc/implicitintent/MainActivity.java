package com.taruc.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }
        //define functions
        public void viewTarc(View v)
        {
            String url = "http://www.tarc.edu.my";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        public void call(View v)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0122274156"));
            startActivity(intent);
        }

        public void home(View v)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            startActivity(intent);
        }

        public void send(View v)
        {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + "mazlindanm@tarc.edu.my"));
            startActivity(intent);
        }


}
