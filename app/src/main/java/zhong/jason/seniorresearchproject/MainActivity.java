package zhong.jason.seniorresearchproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import java.util.Arrays;

import zhong.jason.seniorresearchproject.onboarding.screen.FirstScreen;
import zhong.jason.seniorresearchproject.onboarding.screen.SecondScreen;
import zhong.jason.seniorresearchproject.onboarding.screen.ThirdScreen;

public class MainActivity extends AppCompatActivity {
//Camera Icon or RJB
    ViewPager2 viewPager2;
    RecyclerView.Adapter myFSM;
    ArrayList<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("onBoard", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("FirstBoard", false);
        editor.apply();
        viewPager2 = findViewById(R.id.viewPager);
        fragmentList = new ArrayList<Fragment>(Arrays.asList(
                new FirstScreen(),
                new SecondScreen(),
                new ThirdScreen()));
        myFSM = new myFragmentStateAdapter(fragmentList,
                getSupportFragmentManager(),
                getLifecycle());
        viewPager2.setAdapter(myFSM);

    }

    public void skip(View view) {
        Intent i = new Intent(MainActivity.this, MainPageActivity.class);
        startActivity(i);
        finish();
    }

    private class myFragmentStateAdapter extends FragmentStateAdapter {
        ArrayList<Fragment> list;

        public myFragmentStateAdapter(ArrayList<Fragment> list, FragmentManager fm, Lifecycle lifecycle) {
            super(fm, lifecycle);
            this.list = list;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return list.get(position);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }


}