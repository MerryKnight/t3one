package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int valueInDp = 940;
        int valueInPx = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics()
        );
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
      /*  TextView textView = new TextView(this);
        textView.setText("Goodbye and hello!");
        textView.setTextSize(24);
        textView.setBackgroundColor(Color.GRAY);*/


        int leftInPx = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics()
        );
        int topInPx = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics()
        );
        int rightInPx = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics()
        );
        int bottomInPx = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics()
        );
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
   /*     layoutParams.setMargins(leftInPx,topInPx,rightInPx,bottomInPx);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(leftInPx,topInPx,rightInPx,bottomInPx);
        layoutParams.leftToLeft = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.MATCH_PARENT;*/


       // constraintLayout.addView(textView);
        setContentView(R.layout.activity_main);
       /* textView = findViewById(R.id.header);
        textView.setText("Forever Changes");*/

    }
}