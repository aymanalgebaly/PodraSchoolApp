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
import podra.compubase.com.podraschoolapp.data.model.InboxModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherInboxFragment extends Fragment {


    @BindView(R.id.RCV_inbox_teacher)
    RecyclerView RCVInboxTeacher;
    Unbinder unbinder;
    private InboxAdapter adapter;

    public TeacherInboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teacher_inbox, container, false);
        unbinder = ButterKnife.bind(this, view);

        setupRecycler();
        fetchData();
        return view;
    }

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RCVInboxTeacher.setLayoutManager(layoutManager);
        adapter = new InboxAdapter(getActivity());
        RCVInboxTeacher.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void fetchData() {
        List<InboxModel> inboxModels = new ArrayList<>();

        String[] title = {"اداره المدرسة", "اداره المدرسة", "اداره المدرسة", "اداره المدرسة", "اداره المدرسة"};
        String[] body = {"اداره المدرسه تتشرف بدعوة سيادتكم لحضور حفل تكريم اوائل المدرسه",
                "اداره المدرسه تتشرف بدعوة سيادتكم لحضور حفل تكريم اوائل المدرسه"
                , "اداره المدرسه تتشرف بدعوة سيادتكم لحضور حفل تكريم اوائل المدرسه",
                "اداره المدرسه تتشرف بدعوة سيادتكم لحضور حفل تكريم اوائل المدرسه",
                "اداره المدرسه تتشرف بدعوة سيادتكم لحضور حفل تكريم اوائل المدرسه"};
        String[] date = {"21/10/2010", "21/10/2010", "21/10/2010", "21/10/2010", "21/10/2010"};

        int[] delete_img = {R.drawable.ic_delete_red_24dp, R.drawable.ic_delete_red_24dp
                , R.drawable.ic_delete_red_24dp, R.drawable.ic_delete_red_24dp, R.drawable.ic_delete_red_24dp};

        for (int i = 0; i < title.length; i++) {
            inboxModels.add(new InboxModel(title[i], body[i], date[i], delete_img[i]));
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
