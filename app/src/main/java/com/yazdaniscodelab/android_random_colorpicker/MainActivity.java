package com.yazdaniscodelab.android_random_colorpicker;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView getcolor;

    private Random random;

    int[] colorshere=new int[]{

            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,
            R.color.color6,
            R.color.color7,
            R.color.color8,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn_xml);
        getcolor=(TextView)findViewById(R.id.text_xml);

        random=new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getcolor.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),colorshere[random.nextInt(colorshere.length)]));

            }
        });

    }
}
