package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean imageoneshow =true;
    public  void fad(View view){
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView1=findViewById(R.id.imageView1);
        if(imageoneshow) {
            imageoneshow =false;
            imageView.animate().alpha(0).setDuration(1000);
            imageView1.animate().alpha(1).setDuration(1000);
        }
        else
        {
            imageoneshow =true;
            imageView.animate().alpha(1).setDuration(1000);
            imageView1.animate().alpha(0).setDuration(1000);
        }
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}