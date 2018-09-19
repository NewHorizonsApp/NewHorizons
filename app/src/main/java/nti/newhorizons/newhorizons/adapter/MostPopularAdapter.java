package nti.newhorizons.newhorizons.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.data.entities.Course;

public class MostPopularAdapter extends RecyclerView.Adapter<MostPopularAdapter.ViewHolder> {

    private List<Course> courses;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    public MostPopularAdapter(Context context, List<Course> data) {
        this.mInflater = LayoutInflater.from(context);
        this.courses = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.home_course_item, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.tvCourseName.setText(courses.get(i).getName());
        String cost = String.valueOf(courses.get(i).getCost());
        holder.tvCourseCost.setText(cost);
        holder.ivCourseImage.setImageResource(courses.get(i).getImage());
        holder.tvCourseCategory.setText(courses.get(i).getCategory());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return courses.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCourseName;
        TextView tvCourseCost;
        TextView tvCourseCategory;
        ImageView ivCourseImage;

        ViewHolder(View itemView) {
            super(itemView);
            tvCourseName = itemView.findViewById(R.id.tv_home_course_name);
            tvCourseCost = itemView.findViewById(R.id.tv_home_course_cost);
            tvCourseCategory = itemView.findViewById(R.id.tv_home_course_category);
            ivCourseImage = itemView.findViewById(R.id.iv_home_course_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    Course getItem(int i) {
        return courses.get(i);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}
