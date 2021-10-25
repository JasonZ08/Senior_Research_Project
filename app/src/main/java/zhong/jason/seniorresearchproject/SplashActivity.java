package zhong.jason.seniorresearchproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_splash);
        SharedPreferences sharedPreferences = getSharedPreferences("onBoard", MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putBoolean("FirstBoard", true);
        //editor.apply();
        boolean firstStart = sharedPreferences.getBoolean("FirstBoard", true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i;
                if(firstStart) {
                    i = new Intent(SplashActivity.this,
                            MainActivity.class);
                }
                else{
                    i = new Intent(SplashActivity.this, MainPageActivity.class);
                }
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }}, 3000);
    }

}