package zhong.jason.seniorresearchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {
//Camera Icon or RJB
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashlayout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Slider.class));
            }
        }, 2000);
    }
}