package ua.com.foxminded;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ua.com.foxminded.view.TabCollections;
import ua.com.foxminded.view.TabMaps;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //Returning the current tabs
        switch (position) {
            case 0:
                TabCollections tabCollections = new TabCollections();
                return tabCollections;
            case 1:
                TabMaps tabMaps = new TabMaps();
                return tabMaps;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}