package xebia.ismail.e_learning.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xebia.ismail.e_learning.R;

/**
 * Created by Admin on 3/15/2017.
 */

public class VolumeFragment extends Fragment{

    private static ViewPager mPager;
    private TabLayout mTabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_volume, container, false);
        mPager = (ViewPager) view.findViewById(R.id.pager);
        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);

        mPager.setAdapter(new TabsAdapter(getChildFragmentManager()));
        mTabLayout.setupWithViewPager(mPager);

        setHasOptionsMenu(true);

        return view;
    }

    class TabsAdapter extends FragmentPagerAdapter {

        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new TabGeometry();
                case 1:
                    return new TabGeoCone();
                case 2:
                    return new TabGeoCone();
                case 3:
                    return new TabGeoCone();
                case 4:
                    return new TabGeoCone();
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Cube";
                case 1:
                    return "Rectangular";
                case 2:
                    return "Cylinder";
                case 3:
                    return "Cone";
                case 4:
                    return "Sphere";
            }
            return "";
        }
    }
}
