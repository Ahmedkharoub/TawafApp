package com.Mahdy.tawafguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

public class
SecondScreen extends AppCompatActivity {
    private Button omra;
    private Button hajj;
    private Button adia;
    private Button information;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        findViewById(R.id.action_bar).setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        omra = findViewById(R.id.omra);
        hajj = findViewById(R.id.hajj);
        adia = findViewById(R.id.adia);
        information = findViewById(R.id.information);
        omra.animate()
                .alpha(1)
                .setDuration(700)
                .setStartDelay(500)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();
                        hajj.animate()
                                .alpha(1)
                                .setDuration(800)
                                .setStartDelay(600)
                                .setInterpolator(new FastOutSlowInInterpolator())
                                .start();
                                adia.animate()
                                        .alpha(1)
                                       .setDuration(900)
                                       .setStartDelay(700)
                                        .setInterpolator(new FastOutSlowInInterpolator())
                                         .start();
                        information.animate()
                                .alpha(1)
                                .setDuration(1000)
                                .setStartDelay(800)
                                .setInterpolator(new FastOutSlowInInterpolator())
                                .start();

                    }






    public void OmraActivity ( View view ){
        Intent omra = new Intent(SecondScreen.this,OmraActivity.class);
        startActivity(omra);
    }
    public void HajjActivity ( View view ){
        Intent hajj = new Intent(SecondScreen.this,HajjActivity.class);
        startActivity(hajj);
    }
    public void AdiaActivity ( View view ){
        Intent adia = new Intent(SecondScreen.this,AdiaActivity.class);
        startActivity(adia);
    }
    public void InformationActivity ( View view ){
        Intent info = new Intent(SecondScreen.this,InformationActivity.class);
        startActivity(info);
    }

    @Override
    public boolean onCreateOptionsMenu ( Menu menu ) {
        getMenuInflater().inflate(R.menu.menu_xml,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about_me:
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/1wecT4iChZHd_7UWGBlJ-IAe3yx4BCN9D/view?usp=sharing"));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
