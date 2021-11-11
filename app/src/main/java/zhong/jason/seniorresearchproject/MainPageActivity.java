package zhong.jason.seniorresearchproject;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;


public class MainPageActivity extends AppCompatActivity {
    ViewPager2 mViewPager2;
    RecyclerView.Adapter mMyfragmentStateAdapter;
    ArrayList<Integer> layoutList;
    int NUM_ITEMS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        layoutList.add(R.layout.frag_home_page);
        layoutList.add(R.layout.mp_fragment);
        layoutList.add(R.layout.frag_summary_page);
        //assign instance of viewpager2
        mViewPager2 = findViewById(R.id.mp_container);
        //create an adapter for viewpager2
        mMyfragmentStateAdapter = new MyFragmentStateAdapter(this, layoutList);
        //set the adapter for the view
        mViewPager2.setAdapter(mMyfragmentStateAdapter);
    }

    private class MyFragmentStateAdapter extends FragmentStateAdapter {
        ArrayList<Integer> mLayoutList;

        public MyFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Integer> arrayList) {
            super(fragmentActivity);
            mLayoutList = arrayList;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return MainFragment.newInstance(mViewPager2, position, mLayoutList);
        }

        @Override
        public int getItemCount() {
            return NUM_ITEMS;
        }
    }
}