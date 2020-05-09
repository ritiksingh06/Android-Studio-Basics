package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view) {

        Log.i("Info", "ImageView tapped");

        ImageView bartimageView = (ImageView) findViewById(R.id.bartimageView4);

        ImageView homerimageView = (ImageView) findViewById(R.id.homerimageView4);

        if (bartIsShowing) {

            bartIsShowing = false;

            bartimageView.animate().alpha(0).setDuration(2000);

            homerimageView.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;

            bartimageView.animate().alpha(1).setDuration(2000);

            homerimageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
