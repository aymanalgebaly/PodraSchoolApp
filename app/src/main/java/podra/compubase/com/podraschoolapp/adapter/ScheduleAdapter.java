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
import podra.compubase.com.podraschoolapp.data.ScheduleModel;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolderSchedule> {

    private Context context;
    private List<ScheduleModel>scheduleModelList;

    public ScheduleAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderSchedule onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.schedule_design, viewGroup, false);
        return new ViewHolderSchedule(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSchedule viewHolderSchedule, int i) {

        ScheduleModel scheduleModel = scheduleModelList.get(i);

        viewHolderSchedule.numOfClass.setText(scheduleModel.getClas());
        viewHolderSchedule.nameOfClass.setText(scheduleModel.getBook());
        viewHolderSchedule.from.setText(scheduleModel.getFrom());
        viewHolderSchedule.to.setText(scheduleModel.getTo());

        Picasso.get().load(scheduleModel.getClass_img()).into(viewHolderSchedule.classRoom);
        Picasso.get().load(scheduleModel.getBook_img()).into(viewHolderSchedule.Book);

    }

    @Override
    public int getItemCount() {
        return scheduleModelList != null ? scheduleModelList.size():0;
    }

    public void setData(List<ScheduleModel> scheduleModels) {
        this.scheduleModelList = scheduleModels;
    }

    public class ViewHolderSchedule extends RecyclerView.ViewHolder {

        ImageView classRoom,Book;
        TextView numOfClass,nameOfClass,from,to;

        public ViewHolderSchedule(@NonNull View itemView) {
            super(itemView);

            classRoom = itemView.findViewById(R.id.teacher_img);
            Book = itemView.findViewById(R.id.schedule_open_book);

            numOfClass = itemView.findViewById(R.id.numOfClass);
            nameOfClass = itemView.findViewById(R.id.nameOfClass);
            from = itemView.findViewById(R.id.from_num);
            to = itemView.findViewById(R.id.to_num);
        }
    }
}
