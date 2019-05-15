package podra.compubase.com.podraschoolapp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.ui.activities.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


//    @BindView(R.id.openbook_background_img)
//    CircleImageView openbookBackgroundImg;
//    @BindView(R.id.openbook_img)
//    ImageView openbookImg;
//    @BindView(R.id.education_background_img)
//    CircleImageView educationBackgroundImg;
//    @BindView(R.id.education_img)
//    ImageView educationImg;
//    @BindView(R.id.ckecklist_background_img)
//    CircleImageView ckecklistBackgroundImg;
//    @BindView(R.id.ckecklist_img)
//    ImageView ckecklistImg;
//    @BindView(R.id.calendar_background_img)
//    CircleImageView calendarBackgroundImg;
//    @BindView(R.id.calendar_img)
//    ImageView calendarImg;
//    @BindView(R.id.placeholder_background_img)
//    CircleImageView placeholderBackgroundImg;
//    @BindView(R.id.placeholder_img)
//    ImageView placeholderImg;
//    Unbinder unbinder;

    private ImageView openbook,education,location,checklist,calendar;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        openbook = view.findViewById(R.id.openbook_img);
        openbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity = (HomeActivity) getActivity();
                OpenBookFragment openBookFragment = new OpenBookFragment();
                homeActivity.displaySelectedFragment(openBookFragment);
            }
        });

        education = view.findViewById(R.id.education_img);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity1 = (HomeActivity) getActivity();
                EducationFragment educationFragment = new EducationFragment();
                homeActivity1.displaySelectedFragment(educationFragment);
            }
        });

        location = view.findViewById(R.id.placeholder_img);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity4 = (HomeActivity) getActivity();
                LocationFragment locationFragment = new LocationFragment();
                homeActivity4.displaySelectedFragment(locationFragment);
            }
        });

        checklist = view.findViewById(R.id.ckecklist_img);
        checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity2 = (HomeActivity) getActivity();
                CheckListFragment checkListFragment = new CheckListFragment();
                homeActivity2.displaySelectedFragment(checkListFragment);
            }
        });

        calendar = view.findViewById(R.id.calendar_img);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity3 = (HomeActivity) getActivity();
                CalendarFragment calendarFragment = new CalendarFragment();
                homeActivity3.displaySelectedFragment(calendarFragment);
            }
        });
//        unbinder = ButterKnife.bind(this, view);
        return view;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        unbinder.unbind();
//    }

    }
