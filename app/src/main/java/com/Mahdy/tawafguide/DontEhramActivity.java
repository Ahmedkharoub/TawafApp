package com.Mahdy.tawafguide;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DontEhramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_ehram);
        findViewById(R.id.action_bar).setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
}
