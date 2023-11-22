package com.example.LamBaoChauImageCW2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button forward, backward;
    int countimage=0;
    private int [] imageArray ={R.drawable.picture1, R.drawable.picture2,
            R.drawable.picture3,R.drawable.picture4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = findViewById(R.id.image_View);
        forward = findViewById(R.id.bt_Forward);
        backward = findViewById(R.id.bt_Backward);
        if(countimage ==0) {
            imageview.setImageResource(imageArray[countimage]);
            backward.setVisibility(View.GONE);
            forward.setVisibility(View.VISIBLE);
        }

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countimage ==3){
                    countimage --;
                    imageview.setImageResource(imageArray[countimage]);
                    backward.setVisibility(View.VISIBLE);
                    forward.setVisibility(View.VISIBLE);
                }else {
                    countimage --;
                    imageview.setImageResource(imageArray[countimage]);
                    backward.setVisibility(View.VISIBLE);
                }
                if(countimage ==0){
                    countimage =0;
                    imageview.setImageResource(imageArray[countimage]);
                    backward.setVisibility(View.GONE);
                    forward.setVisibility(View.VISIBLE);
                }
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(countimage==0){
                    imageview.setImageResource(imageArray[countimage]);
                    forward.setVisibility(View.VISIBLE);
                    backward.setVisibility(View.VISIBLE);
                    countimage  ++;
                }
                if(countimage==3){
                    imageview.setImageResource(imageArray[countimage]);
                    forward.setVisibility(View.GONE);
                    backward.setVisibility(View.VISIBLE);
                    countimage=3;
                }else {
                    imageview.setImageResource(imageArray[countimage]);
                    forward.setVisibility(View.VISIBLE);
                    backward.setVisibility(View.VISIBLE);
                    countimage  ++;
                }
            }
        });
    }
}