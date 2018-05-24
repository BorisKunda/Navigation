package com.happytrees.navigation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String currentLattitude = "31.96167523";
        String currentLongitude = "34.88159882";
        String targetLat   = "31.9903016";
        String targetLang  = "34.774205";
        String myUrl = "http://maps.google.com/maps?saddr="+currentLattitude+","+currentLongitude+"&daddr="+targetLat+","+targetLang+"&mode=driving";

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl));
        startActivity(intent);
    }
}
