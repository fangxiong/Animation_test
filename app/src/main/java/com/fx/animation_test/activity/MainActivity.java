package com.fx.animation_test.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fx.animation_test.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.button1:
                intent.setClass(MainActivity.this,ViewAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent.setClass(MainActivity.this,FrameAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent.setClass(MainActivity.this,PropertyAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
//                intent.setClass(MainActivity.this,ViewAnimationActivity.class);
//                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
