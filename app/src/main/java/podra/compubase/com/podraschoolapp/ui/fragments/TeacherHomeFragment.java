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
import podra.compubase.com.podraschoolapp.ui.activities.TeacherHomeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherHomeFragment extends Fragment {


    @BindView(R.id.openbook_background_img_teacher)
    CircleImageView openbookBackgroundImgTeacher;
    @BindView(R.id.openbook_img_teacher)
    ImageView openbookImgTeacher;
    @BindView(R.id.schedule_teacher)
    CircleImageView scheduleTeacher;
    @BindView(R.id.schedule_teacher_img)
    ImageView scheduleTeacherImg;
    Unbinder unbinder;

    public TeacherHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teacher_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.openbook_img_teacher, R.id.schedule_teacher_img})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.openbook_img_teacher:
                TeacherHomeActivity teacherHomeActivity1 = (TeacherHomeActivity) getActivity();
                AddHomeWorkFragment addHomeWorkFragment = new AddHomeWorkFragment();
                teacherHomeActivity1.displaySelectedTeacherFragment(addHomeWorkFragment);
                break;
            case R.id.schedule_teacher_img:
                TeacherHomeActivity teacherHomeActivity = (TeacherHomeActivity) getActivity();
                ScheduleTeacherFragment scheduleTeacherFragment = new ScheduleTeacherFragment();
                teacherHomeActivity.displaySelectedTeacherFragment(scheduleTeacherFragment);
                break;
        }
    }
}
