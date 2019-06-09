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
import podra.compubase.com.podraschoolapp.adapter.LibraryAdapter;
import podra.compubase.com.podraschoolapp.adapter.ScheduleAdapter;
import podra.compubase.com.podraschoolapp.data.ScheduleModel;
import podra.compubase.com.podraschoolapp.data.model.LibraryModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryFragment extends Fragment {


    @BindView(R.id.rcv_library)
    RecyclerView rcvLibrary;
    Unbinder unbinder;
    private LibraryAdapter adapter;

    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rcvLibrary.setLayoutManager(layoutManager);
        adapter = new LibraryAdapter(getActivity());
        rcvLibrary.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void fetchData() {
        List<LibraryModel> libraryModels = new ArrayList<>();

        String[] name = {"Book One", "Book Two", "Book Three", "Book Four", "Book Five"};
        String[] num = {"1", "2", "3", "4", "5"};
        String[] num_of_rack = {"1", "2", "3", "4", "5"};

        for (int i = 0; i < name.length; i++) {
            libraryModels.add(new LibraryModel(name[i],num[i],num_of_rack[i]));
        }
        adapter.setData(libraryModels);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
