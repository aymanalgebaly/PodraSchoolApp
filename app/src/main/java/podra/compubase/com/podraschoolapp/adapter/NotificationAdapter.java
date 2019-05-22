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
import podra.compubase.com.podraschoolapp.data.model.NotificationModel;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolderNotification> {

    private Context context;
    private List<NotificationModel>notificationModelList;

    public NotificationAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderNotification onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_design, viewGroup, false);
        return new ViewHolderNotification(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderNotification viewHolderNotification, int i) {
        NotificationModel notificationModel = notificationModelList.get(i);

        viewHolderNotification.title.setText(notificationModel.getTitle());
        viewHolderNotification.body.setText(notificationModel.getBody());

        Picasso.get().load(notificationModel.getNoti_img()).into(viewHolderNotification.noti_img);
    }

    @Override
    public int getItemCount() {
        return notificationModelList != null ? notificationModelList.size():0;
    }

    public void setData(List<NotificationModel> notificationModels) {
        this.notificationModelList = notificationModels;
    }

    public class ViewHolderNotification extends RecyclerView.ViewHolder {

        TextView title,body;
        ImageView noti_img;
        public ViewHolderNotification(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.noti_txt);
            body = itemView.findViewById(R.id.noti_body);

            noti_img = itemView.findViewById(R.id.noti_img);
        }
    }
}
