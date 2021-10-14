package zhong.jason.seniorresearchproject.onboarding.screen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhong.jason.seniorresearchproject.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstScreen#} factory method to
 * create an instance of this fragment.
 */
public class FirstScreen extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_screen, container, false);
    }
}