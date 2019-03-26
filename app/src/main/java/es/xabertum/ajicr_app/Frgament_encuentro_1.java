package es.xabertum.ajicr_app;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Frgament_encuentro_1 extends Fragment {
    
    private ViewPager mViewPager;
    private TabLayout mTabs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_encuentro_1_tabbed, container, false);

        // Setting ViewPager for ecach Tab
        mViewPager = view.findViewById(R.id.viewpager);
        setupViewPager(mViewPager);

        //Set tabs inside Toolbar
        mTabs = view.findViewById(R.id.result_tabs);
        mTabs.setupWithViewPager(mViewPager);

        return view;


    }

    private void setupViewPager(ViewPager mViewPager) {

        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new Fragment_jornadas_1(), "Jornadas 1");
        adapter.addFragment(new Fragment_jornadas_1(), "Jornadas 2");
        adapter.addFragment(new Fragment_jornadas_1(), "Jornadas 3");
        mViewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
