package es.xabertum.ajicr_app.Encuentros;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import es.xabertum.ajicr_app.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerEncuentros1 extends Fragment {
    
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

        // Setting ViewPager for each Tab
        mViewPager = view.findViewById(R.id.viewpager);
        setupViewPager(mViewPager);

        //Set tabs inside Toolbar
        mTabs = view.findViewById(R.id.result_tabs);
        mTabs.setupWithViewPager(mViewPager);

        return view;


    }

    private void setupViewPager(ViewPager mViewPager) {

        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new Fragment_encuentros_1_principal(), "Principal");
        adapter.addFragment(new Fragment_encuentros_1_gallery(), "Galeria");
        mViewPager.setAdapter(adapter);

    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }

    static class Adapter extends FragmentStatePagerAdapter {
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
