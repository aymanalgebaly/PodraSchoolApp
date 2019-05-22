package podra.compubase.com.podraschoolapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import podra.compubase.com.podraschoolapp.R;
import podra.compubase.com.podraschoolapp.data.model.InboxModel;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.ViewHolderInbox> {

    private Context context;
    private List<InboxModel>inboxModelList;

    public InboxAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderInbox onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.inbox_design, viewGroup, false);
        return new ViewHolderInbox(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderInbox viewHolderInbox, int i) {
        InboxModel inboxModel = inboxModelList.get(i);

        viewHolderInbox.title.setText(inboxModel.getTitle());
        viewHolderInbox.body.setText(inboxModel.getBody());
        viewHolderInbox.date.setText(inboxModel.getDate());

        Picasso.get().load(inboxModel.getDelete_img()).into(viewHolderInbox.delete_img);

    }

    @Override
    public int getItemCount() {
        return inboxModelList != null ? inboxModelList.size():0;
    }

    public void setData(List<InboxModel> inboxModels) {

        this.inboxModelList = inboxModels;
    }

    public class ViewHolderInbox extends RecyclerView.ViewHolder {

        TextView title,body,date;
        ImageView delete_img;
        public ViewHolderInbox(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.inbox_txt);
            body = itemView.findViewById(R.id.inbox_body);
            date = itemView.findViewById(R.id.date_txt);

            delete_img = itemView.findViewById(R.id.delete_img_inbox);
        }
    }
}
