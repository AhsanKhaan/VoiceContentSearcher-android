package com.example.test.Activities;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.astuetz.PagerSlidingTabStrip;
import com.example.test.Adapters.MyTabAdapter;
import com.example.test.R;

import butterknife.BindView;
import butterknife.ButterKnife;



public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tabs) PagerSlidingTabStrip tabs;
    @BindView(R.id.pager) ViewPager viewPager;
    @BindView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager.setAdapter(new MyTabAdapter(getSupportFragmentManager()));
        tabs.setViewPager(viewPager);
        setSupportActionBar(toolbar);

    }
}
