package com.fx.animation_test.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.fx.animation_test.R;

public class ViewAnimationActivity extends AppCompatActivity {

    private CardView cardView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        cardView = (CardView)findViewById(R.id.cardView);
        Animation animationSet = AnimationUtils.loadAnimation(ViewAnimationActivity.this,R.anim.view_animation);
        cardView.startAnimation(animationSet);
    }
}
