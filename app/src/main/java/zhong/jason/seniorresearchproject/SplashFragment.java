package zhong.jason.seniorresearchproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SplashFragment#} factory method to
 * create an instance of this fragment.
 *
 */
public class SplashFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        new Handler().postDelayed({
                Navigation.findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)}, 3000
        );
        //7:32
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }
}