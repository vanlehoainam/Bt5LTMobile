package vn.edu.pxu.bt5ltmobile;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        // Add Fragments to ViewPager
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new Fragment1(), "Tab 1");
        pagerAdapter.addFragment(new Fragment2(), "Tab 2");
        pagerAdapter.addFragment(new Fragment3(), "Tab 3");
        viewPager.setAdapter(pagerAdapter);

        // Link ViewPager with TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }
}
