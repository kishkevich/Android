package com.example.inna.homeworks.hw1;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inna.homeworks.R;

public class Activity_hw1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1);

        Button button = findViewById(R.id.button);
        TextView tw1 = findViewById(R.id.textView1);
        TextView tw2 = findViewById(R.id.textView2);


        tw1.setOnClickListener(this);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
            }
        };

        tw2.setOnClickListener(onClickListener);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
            }
        });

    }

    @Override
    public void onClick(View v) {
        click();
    }

    private void click (){
        TextView tw1 = findViewById(R.id.textView1);
        TextView tw2 = findViewById(R.id.textView2);
        String text1 = tw1.getText().toString();
        String text2 = tw2.getText().toString();
        Drawable color1 = tw1.getBackground();
        Drawable color2 = tw2.getBackground();
        tw1.setText(text2);
        tw2.setText(text1);
        tw1.setBackground(color2);
        tw2.setBackground(color1);

    }
}
