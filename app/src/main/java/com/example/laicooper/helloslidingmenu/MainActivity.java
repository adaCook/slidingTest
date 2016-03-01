package com.example.laicooper.helloslidingmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlidingMenu menu=new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setBehindOffsetRes(R.dimen.sliding_menu_offset);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.slidingmenu);
    }
}
