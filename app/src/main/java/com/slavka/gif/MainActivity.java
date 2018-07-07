package com.slavka.gif;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ScrollingPagerIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        indicator = findViewById(R.id.indicator);

        List<Integer> gifs = new ArrayList<>();
        gifs.add(R.drawable.test);
        gifs.add(R.drawable.test);
        gifs.add(R.drawable.test);

        viewPager.setAdapter(new GifSliderAdapter(this, gifs));
        indicator.attachToPager(viewPager);
    }
}
