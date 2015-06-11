package com.hhl.slidingmenuswipebackdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSwipeBack(View v) {
        Intent intent = new Intent(this,NextActivity.class);
        intent.putExtra("index",1);
        startActivity(intent);
    }

}
