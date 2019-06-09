package podra.compubase.com.podraschoolapp.ui.fragments;


import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.adapter.VP_ScheduleAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleTeacherFragment extends Fragment {

    private VP_ScheduleAdapter vp_scheduleAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;



    public ScheduleTeacherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_schedule_teacher, container, false);

        viewPager = view.findViewById(R.id.viewPager_contacts);
        tabLayout = view.findViewById(R.id.tabsss);
        tabLayout.setupWithViewPager(viewPager);
        vp_scheduleAdapter = new VP_ScheduleAdapter(getChildFragmentManager());
        viewPager.setAdapter(vp_scheduleAdapter);

        View root = tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(getResources().getColor(R.color.white));
//            drawable.setSize(4, 1);
            ((LinearLayout) root).setDividerPadding(10);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
        return view;
    }

}
