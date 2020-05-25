package com.Mahdy.tawafguide;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TypeHajjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_hajj);
        findViewById(R.id.action_bar).setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
}
