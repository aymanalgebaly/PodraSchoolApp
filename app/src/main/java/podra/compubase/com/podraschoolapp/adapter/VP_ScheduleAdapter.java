package podra.compubase.com.podraschoolapp.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import podra.compubase.com.podraschoolapp.ui.fragments.MondayFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.SundayFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.ThursdayFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.TuesdayFragment;
import podra.compubase.com.podraschoolapp.ui.fragments.WednesdayFragment;

public class VP_ScheduleAdapter extends FragmentPagerAdapter {

    Fragment[] fragments = {new SundayFragment(), new MondayFragment(), new TuesdayFragment(), new WednesdayFragment(), new ThursdayFragment()};
    private String title;

    public VP_ScheduleAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                title = "Sun";
                break;
            case 1:
                title = "Mon";
                break;
            case 2:
                title = "Tue";
                break;
            case 3:
                title = "Wen";
                break;
            case 4:
                title = "Thu";
                break;
        }
        return title;

    }
}
