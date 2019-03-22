package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        Button mxb = (Button) findViewById(R.id.mxb);
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        Button quadBtn = (Button) findViewById(R.id.quadBtn);
        Button listViewBtn = (Button) findViewById(R.id.listViewBtn);

        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.example.quicklauncher.SOMETHING", "Hello World! It's time. ~ John");
                startActivity(startIntent);
                */
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.caleb_p_firstapp_addition");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }

        });

        mxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.johncalculator");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }

        });


        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.bonziworld.com";
                Uri webAddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }


            }

        });

        quadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.quadratic");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }


            }

        });

        listViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.listapp");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }


            }

        });




    }

}
