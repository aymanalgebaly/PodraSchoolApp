package podra.compubase.com.podraschoolapp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.adapter.NotificationAdapter;
import podra.compubase.com.podraschoolapp.data.model.NotificationModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherNotificationFragment extends Fragment {


    @BindView(R.id.RCV_notification_teacher)
    RecyclerView RCVNotificationTeacher;
    Unbinder unbinder;
    private NotificationAdapter adapter;

    public TeacherNotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teacher_notification, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVNotificationTeacher.setLayoutManager(layoutManager);
        adapter = new NotificationAdapter(getActivity());
        RCVNotificationTeacher.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void fetchData() {
        List<NotificationModel> notificationModels = new ArrayList<>();

        String[] title = {"تنويه هام", "تنويه هام", "تنويه هام", "تنويه هام", "تنويه هام"};
        String[] body = {"سوف يتم انعقاد اجتماع مجلس الاباء غدا الساعة", "سوف يتم انعقاد اجتماع مجلس الاباء غدا الساعة",
                "سوف يتم انعقاد اجتماع مجلس الاباء غدا الساعة", "سوف يتم انعقاد اجتماع مجلس الاباء غدا الساعة",
                "سوف يتم انعقاد اجتماع مجلس الاباء غدا الساعة"};

        int[] noti_img = {R.drawable.ic_notifications_red_24dp, R.drawable.ic_notifications_red_24dp, R.drawable.ic_notifications_red_24dp
                , R.drawable.ic_notifications_red_24dp, R.drawable.ic_notifications_red_24dp};

        for (int i = 0; i < title.length; i++) {
            notificationModels.add(new NotificationModel(title[i], body[i], noti_img[i]));
        }
        adapter.setData(notificationModels);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
