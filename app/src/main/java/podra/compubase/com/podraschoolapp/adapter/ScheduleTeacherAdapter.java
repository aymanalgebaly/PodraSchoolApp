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
import podra.compubase.com.podraschoolapp.data.model.ScheduleTeacherModel;


public class ScheduleTeacherAdapter extends RecyclerView.Adapter<ScheduleTeacherAdapter.View1holderScheduleTeacher> {

    private Context context;
    private List<ScheduleTeacherModel> scheduleTeacherModelList;

    public ScheduleTeacherAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public View1holderScheduleTeacher onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.schedule_design, viewGroup, false);
        return new View1holderScheduleTeacher(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View1holderScheduleTeacher view1holderScheduleTeacher, int i) {

        ScheduleTeacherModel scheduleTeacherModel = scheduleTeacherModelList.get(i);

        view1holderScheduleTeacher.numOfClass.setText(scheduleTeacherModel.getClas());
        view1holderScheduleTeacher.nameOfClass.setText(scheduleTeacherModel.getBook());
        view1holderScheduleTeacher.from.setText(scheduleTeacherModel.getFrom());
        view1holderScheduleTeacher.to.setText(scheduleTeacherModel.getTo());

        Picasso.get().load(scheduleTeacherModel.getClass_img()).into(view1holderScheduleTeacher.classRoom);
        Picasso.get().load(scheduleTeacherModel.getBook_img()).into(view1holderScheduleTeacher.Book);
    }

    @Override
    public int getItemCount() {
        return scheduleTeacherModelList != null ?scheduleTeacherModelList.size():0;
    }

    public class View1holderScheduleTeacher extends RecyclerView.ViewHolder {

        ImageView classRoom,Book;
        TextView numOfClass,nameOfClass,from,to;

        public View1holderScheduleTeacher(@NonNull View itemView) {
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
