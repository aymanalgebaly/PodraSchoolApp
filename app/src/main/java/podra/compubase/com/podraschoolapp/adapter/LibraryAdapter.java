package podra.compubase.com.podraschoolapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.data.model.LibraryModel;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.ViewHolderLibraryAdapter> {

    private Context context;
    private List<LibraryModel>libraryModelList;

    public LibraryAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderLibraryAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.library_design, viewGroup, false);
        return new ViewHolderLibraryAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibraryAdapter viewHolderLibraryAdapter, int i) {

        LibraryModel libraryModel = libraryModelList.get(i);

        viewHolderLibraryAdapter.name.setText(libraryModel.getNameOfBook());
        viewHolderLibraryAdapter.num.setText(libraryModel.getNum());
        viewHolderLibraryAdapter.num_of_rack.setText(libraryModel.getNum_Rack());
    }

    @Override
    public int getItemCount() {
        return libraryModelList != null ? libraryModelList.size():0;
    }

    public void setData(List<LibraryModel> libraryModels) {
        this.libraryModelList = libraryModels;
    }

    public class ViewHolderLibraryAdapter extends RecyclerView.ViewHolder {

        TextView name,num,num_of_rack;
        public ViewHolderLibraryAdapter(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_of_book);
            num = itemView.findViewById(R.id.num_of);
            num_of_rack = itemView.findViewById(R.id.num_of_rack);
        }
    }
}
