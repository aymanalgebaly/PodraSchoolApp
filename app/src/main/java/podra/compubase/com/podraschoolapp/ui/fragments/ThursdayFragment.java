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
import podra.compubase.com.podraschoolapp.adapter.ScheduleAdapter;
import podra.compubase.com.podraschoolapp.data.ScheduleModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThursdayFragment extends Fragment {


    @BindView(R.id.RCV_thu)
    RecyclerView RCVThu;
    Unbinder unbinder;
    private ScheduleAdapter adapter;

    public ThursdayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thursday, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVThu.setLayoutManager(layoutManager);
        adapter = new ScheduleAdapter(getActivity());
        RCVThu.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void fetchData (){
        List<ScheduleModel> scheduleModels = new ArrayList<>();

        String [] numOfClass = {"First Class","First Class","First Class","First Class","First Class"};
        String [] nameOfClass = {"Arabic","Arabic","Arabic","Arabic","Arabic"};
        String [] from = {"08:00","08:00","08:00","08:00","08:00"};
        String [] to = {"09:00","09:00","09:00","09:00","09:00"};

        int [] classIMg = {R.drawable.teachers,R.drawable.teachers,R.drawable.teachers,R.drawable.teachers,R.drawable.teachers};
        int [] book = {R.drawable.open_book_final,R.drawable.open_book_final,R.drawable.open_book_final,
                R.drawable.open_book_final,R.drawable.open_book_final};
        for (int i = 0; i <numOfClass.length ; i++) {
            scheduleModels.add(new ScheduleModel(classIMg[i],book[i],numOfClass[i],nameOfClass[i],from[i],to[i]));
        }
        adapter.setData(scheduleModels);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
