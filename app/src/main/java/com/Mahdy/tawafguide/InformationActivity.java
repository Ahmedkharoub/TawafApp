package com.Mahdy.tawafguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
private Button meqat;
private Button omra;
private Button omrafordead;
private Button womanomera;
private Button timehajj;
private Button hajj;
private  Button typehajj;
private Button favhajj;
private Button diffhajj;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        findViewById(R.id.action_bar).setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
       meqat = findViewById(R.id.meqat_harm);
       omra = findViewById(R.id.omra);
       omrafordead = findViewById(R.id.Omra2_info);
       womanomera = findViewById(R.id.button7);
       timehajj = findViewById(R.id.button8);
       hajj = findViewById(R.id.button10);
       typehajj = findViewById(R.id.button11);
       favhajj = findViewById(R.id.button9);
       diffhajj = findViewById(R.id.button12);

    }
    public void meqat (View view){
        Intent x = new Intent(InformationActivity.this,MeqatHaramActivity.class);
        startActivity(x);
    }
    public void omra (View view){
        Intent y = new Intent(InformationActivity.this,InfoomraActivity.class);
        startActivity(y);
    }
    public void omra2 (View view){
        Intent y = new Intent(InformationActivity.this,OmarForDeadActivity.class);
        startActivity(y);
    }
    public void dontehram (View view){
        Intent y = new Intent(InformationActivity.this,DontEhramActivity.class);
        startActivity(y);
    }
    public void woman (View view){
        Intent y = new Intent(InformationActivity.this,WomanOmeraActivity.class);
        startActivity(y);
    }
    public void timehajj (View view){
        Intent y = new Intent(InformationActivity.this,TimeHajjActivity.class);
        startActivity(y);
    }
    public void hajj (View view){
        Intent y = new Intent(InformationActivity.this,InfoHajjActivity.class);
        startActivity(y);
    }
    public void typehajj (View view){
        Intent y = new Intent(InformationActivity.this,TypeHajjActivity.class);
        startActivity(y);
    }
    public void favhajj (View view){
        Intent y = new Intent(InformationActivity.this,HajjFavoActivity.class);
        startActivity(y);
    }
    public void diffhajj (View view){
        Intent y = new Intent(InformationActivity.this,DiffHajjActivity.class);
        startActivity(y);
    }
}
