package podra.compubase.com.podraschoolapp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import podra.compubase.com.podraschoolapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddHomeWorkFragment extends Fragment {
    private Spinner classesSpinner;


//    @BindView(R.id.classes_spinner)
//    Spinner classesSpinner;
//    Unbinder unbinder;

    public AddHomeWorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_home_work, container, false);
//        unbinder = ButterKnife.bind(this, view);

        classesSpinner = view.findViewById(R.id.classes_spinner);
        String[] classes = new String[]{"Class one","Class two","Class three","Class four"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, classes);
        classesSpinner.setAdapter(adapter);
        return view;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        unbinder.unbind();
//    }
//
//    @OnClick(R.id.classes_spinner)
//    public void onViewClicked() {
//    }
}
