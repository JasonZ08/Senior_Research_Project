package zhong.jason.seniorresearchproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPager);
        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>(Arrays.asList(
                new FirstScreen(),
                new SecondScreen(),
                new ThirdScreen()));
        myFSM = new myFragmentStateAdapter(fragmentList,
                getSupportFragmentManager(),
                getLifecycle());
        viewPager2.setAdapter(myFSM);

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