package zhong.jason.seniorresearchproject;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    ViewPager2 mViewPager2;
    int position;
    ArrayList<Integer> mLayoutList;

    public static Fragment newInstance(ViewPager2 mViewPager2, int position, ArrayList<Integer> arrayList){
        MainFragment fragment = new MainFragment();
        fragment.mViewPager2 = mViewPager2;
        fragment.position = position;
        fragment.mLayoutList = arrayList;

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(mLayoutList.get(position), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // add to tabLayout
        TabLayout tabLayout = getActivity().findViewById(R.id.tab_layout);

        View view1 = getLayoutInflater().inflate(R.layout.custom_view, null);
        View view2 = getLayoutInflater().inflate(R.layout.custom_view, null);
        View view3 = getLayoutInflater().inflate(R.layout.custom_view, null);
        view3.findViewById(R.id.customView).setBackgroundResource(R.drawable.summary_tabicon);
        view2.findViewById(R.id.customView).setBackgroundResource(R.drawable.camera_tabicon);
        view1.findViewById(R.id.customView).setBackgroundResource(R.drawable.home_tabicon);
        view1.setPadding(80, 30, 80, 30);
        view2.setPadding(10, 10, 10, 10);
        view3.setPadding(105, 45, 105, 45);
        View [] views = new View[]{view1, view2, view3};
        new TabLayoutMediator(tabLayout, mViewPager2, (tab, position) -> tab.setCustomView(views[position])).attach();
        TextView textView = view.findViewById(R.id.display);
        textView.setText("" + position);

    }
}
