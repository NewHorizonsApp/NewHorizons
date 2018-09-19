package nti.newhorizons.newhorizons.view.activity.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.view.fragment.courses.CoursesFragment;
import nti.newhorizons.newhorizons.view.fragment.home.HomeFragment;

public class MainActivity extends AppCompatActivity {
    Fragment mainFragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager = getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout_main_container, new HomeFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_courses:
                    fragmentManager = getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout_main_container, new CoursesFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_profile:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mainFragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout_main_container, mainFragment);
        fragmentTransaction.commit();


    }

}
