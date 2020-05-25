package com.Mahdy.tawafguide;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InfoHajjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hajj);
        findViewById(R.id.action_bar).setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
}
