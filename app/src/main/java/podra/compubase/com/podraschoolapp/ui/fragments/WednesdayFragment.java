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
public class WednesdayFragment extends Fragment {


    @BindView(R.id.RCV_wed)
    RecyclerView RCVWed;
    Unbinder unbinder;
    private ScheduleAdapter adapter;

    public WednesdayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wednesday, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVWed.setLayoutManager(layoutManager);
        adapter = new ScheduleAdapter(getActivity());
        RCVWed.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void fetchData (){
        List<ScheduleModel> scheduleModels = new ArrayList<>();

        String [] numOfClass = {"FIRST CLASS","FIRST CLASS","FIRST CLASS","FIRST CLASS","FIRST CLASS"};
        String [] nameOfClass = {"ARABIC","ARABIC","ARABIC","ARABIC","ARABIC"};
        String [] from = {"08:00","08:00","08:00","08:00","08:00"};
        String [] to = {"09:00","09:00","09:00","09:00","09:00"};

        int [] classIMg = {R.drawable.teacher_new,R.drawable.teacher_new,R.drawable.teacher_new,R.drawable.teacher_new,R.drawable.teacher_new};
        int [] book = {R.drawable.open_book_new,R.drawable.open_book_new,R.drawable.open_book_new,R.drawable.open_book_new,R.drawable.open_book_new};

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
