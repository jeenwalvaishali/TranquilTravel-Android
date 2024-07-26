package com.jeenwalv.tranquiltravels.activity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import androidx.core.content.ContextCompat;

import com.jeenwalv.tranquiltravels.R;
import com.jeenwalv.tranquiltravels.adapter.SplashPagerAdapter;

public class SplashActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private int[] layouts = {R.layout.screen_one, R.layout.screen_two, R.layout.screen_three};
    private LinearLayout dotsLayout;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_pager);

        viewPager = findViewById(R.id.viewPager);
        dotsLayout = findViewById(R.id.dotsLayout);

        SplashPagerAdapter adapter = new SplashPagerAdapter(layouts);
        viewPager.setAdapter(adapter);

        addDotsIndicator(0);
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                addDotsIndicator(position);
                if (position == layouts.length - 1) {
                    // Transition to MainActivity after the last splash screen
                    viewPager.postDelayed(() -> {
                        Intent i = new Intent(SplashActivity.this, RegisterActivity.class);
                        startActivity(i);
                        finish();
                    }, 3000); // 3 seconds delay
                }
            }
        });
    }

    private void addDotsIndicator(int position) {
        dots = new ImageView[layouts.length];
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new ImageView(this);
            if (i == position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_active));
            } else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_inactive));
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            dotsLayout.addView(dots[i], params);
        }
    }
}
