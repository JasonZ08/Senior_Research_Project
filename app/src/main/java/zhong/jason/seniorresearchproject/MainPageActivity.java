package zhong.jason.seniorresearchproject;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MainPageActivity extends AppCompatActivity {
    ArrayList<StoringFragment> myStoringFragment = new ArrayList<StoringFragment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        StoringFragment ex1 = new StoringFragment("test1", "test1", "test1");
        myStoringFragment.add(ex1);
        StoringFragment ex2 = new StoringFragment("test2", "test2", "test2");
        myStoringFragment.add(ex2);
        ListView listView = (ListView) findViewById(R.id.listview);
        SFAdapter sfAdapter = new SFAdapter(this, myStoringFragment);
        listView.setAdapter(sfAdapter);
        myStoringFragment.add(ex2);
        myStoringFragment.add(ex2);
        myStoringFragment.add(ex2);
        myStoringFragment.add(ex2);
        myStoringFragment.add(ex2);

    }
    public void camera(View view) {
        Intent i = new Intent(MainPageActivity.this, Camera_Activity.class);
        startActivity(i);
        finish();
    }

}