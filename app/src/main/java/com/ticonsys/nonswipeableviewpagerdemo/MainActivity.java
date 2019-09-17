package com.ticonsys.nonswipeableviewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ticonsys.nonswipeableviewpager.NonSwipeableViewPager;

public class MainActivity extends AppCompatActivity {

    private NonSwipeableViewPager viewPager;
    private MyPagerAdapter mAdapter;
    private int currentPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        ImageView ivLeft = findViewById(R.id.ivLeft);
        ImageView ivRight = findViewById(R.id.ivRight);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);

        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentPosition > 0){
                    currentPosition--;
                    viewPager.setCurrentItem(currentPosition);
                }
            }
        });

        ivRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentPosition < mAdapter.getCount()-1){
                    currentPosition++;
                    viewPager.setCurrentItem(currentPosition);
                }
            }
        });
    }
}
