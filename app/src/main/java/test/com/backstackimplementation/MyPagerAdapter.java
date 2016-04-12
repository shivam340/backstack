package test.com.backstackimplementation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private static final int COUNT = 10;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        FragmentForPager fragmentForPager = new FragmentForPager();
        fragmentForPager.setName(""+(position+1));
        return fragmentForPager;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}