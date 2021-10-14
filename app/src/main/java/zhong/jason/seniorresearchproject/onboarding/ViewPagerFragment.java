package zhong.jason.seniorresearchproject.onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

import zhong.jason.seniorresearchproject.R;
import zhong.jason.seniorresearchproject.onboarding.screen.FirstScreen;
import zhong.jason.seniorresearchproject.onboarding.screen.SecondScreen;
import zhong.jason.seniorresearchproject.onboarding.screen.ThirdScreen;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewPagerFragment#} factory method to
 * create an instance of this fragment.
 */
public class ViewPagerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>(Arrays.asList(
                new FirstScreen(),
                new SecondScreen(),
                new ThirdScreen()));
        ViewPagerAdapter adapter = new ViewPagerAdapter(
                fragmentList,
                requireActivity().getSupportFragmentManager(),
                getLifecycle());

        ((ViewPager2)view.findViewById(R.id.viewPager)).setAdapter(adapter); //SCUFFED
        return view;
    }
}