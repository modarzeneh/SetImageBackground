package com.example.modar.setimagebackground;

import android.app.WallpaperManager;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    int num=0;
    int[] images_array = {R.drawable.image1,R.drawable.image2,
                          R.drawable.image3,R.drawable.image4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView)findViewById(R.id.imageView);
    }

    public void btn_set(View view) {
        //set the image as background in the phone
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getBaseContext());
        try {
            wallpaperManager.setResource(images_array[num]);
            Toast.makeText(this, "Wallpaper has Been Set Successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btn_image(View view) {

        if(num<3){
            num++;
            image1.setImageResource(images_array[num]);
        }else{
            num=0;
            image1.setImageResource(images_array[num]);
        }


    }
}
