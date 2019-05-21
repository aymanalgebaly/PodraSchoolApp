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
import podra.compubase.com.podraschoolapp.adapter.ScheduleAdapter;
import podra.compubase.com.podraschoolapp.data.ScheduleModel;
import podra.compubase.com.podraschoolapp.data.model.NotificationModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {


    @BindView(R.id.RCV_notification)
    RecyclerView RCVNotification;
    Unbinder unbinder;
    private NotificationAdapter adapter;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVNotification.setLayoutManager(layoutManager);
        adapter = new NotificationAdapter(getActivity());
        RCVNotification.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void fetchData (){
        List<NotificationModel> notificationModels = new ArrayList<>();

        String [] title = {"Not 1","Not 2","Not 3","Not 4","Not 5"};
        String [] body = {"Welcome","Welcome","Welcome","Welcome","Welcome"};

        for (int i = 0; i <title.length ; i++) {
            notificationModels.add(new NotificationModel(title[i],body[i]));
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
