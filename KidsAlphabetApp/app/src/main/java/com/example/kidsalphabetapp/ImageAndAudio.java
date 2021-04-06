package com.example.kidsalphabetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageAndAudio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_and_audio2);

        String name=getIntent().getStringExtra("name").toLowerCase();

        ImageView imageView=findViewById(R.id.imageView);
        int id=getResources().getIdentifier(name,"drawable",getPackageName());
       //Toast.makeText(this,id,Toast.LENGTH_LONG).show();
        imageView.setImageResource(id);
        int mId=getResources().getIdentifier(name,"raw",getPackageName());
        MediaPlayer mp= MediaPlayer.create(this,mId);
        mp.start();
    }
    public void roateImage(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().rotation(720).scaleX(0.2f).scaleY(0.2f).alpha(0).setDuration(2000);

    }
}