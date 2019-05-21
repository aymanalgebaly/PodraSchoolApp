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
import podra.compubase.com.podraschoolapp.adapter.InboxAdapter;
import podra.compubase.com.podraschoolapp.adapter.NotificationAdapter;
import podra.compubase.com.podraschoolapp.data.model.InboxModel;
import podra.compubase.com.podraschoolapp.data.model.NotificationModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class InboxFragment extends Fragment {


    @BindView(R.id.RCV_inbox)
    RecyclerView RCVInbox;
    Unbinder unbinder;
    private InboxAdapter adapter;

    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVInbox.setLayoutManager(layoutManager);
        adapter = new InboxAdapter(getActivity());
        RCVInbox.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void fetchData (){
        List<InboxModel> inboxModels = new ArrayList<>();

        String [] title = {"Message 1","Message 2","Message 3","Message 4","Message 5"};
        String [] body = {"Welcome","Welcome","Welcome","Welcome","Welcome"};

        for (int i = 0; i <title.length ; i++) {
            inboxModels.add(new InboxModel(title[i],body[i]));
        }
        adapter.setData(inboxModels);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
