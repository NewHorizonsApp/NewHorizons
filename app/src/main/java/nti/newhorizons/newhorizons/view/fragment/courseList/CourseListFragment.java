package nti.newhorizons.newhorizons.view.fragment.courseList;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import nti.newhorizons.newhorizons.R;

public class CourseListFragment extends Fragment{
    ListView lvCourses;
    CourseListPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_course_list, container, false);

        init(rootView);
        presentData();
        actions();
        
        return rootView;
    }

    private void actions() {
        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tvCourseToastName=view.findViewById(R.id.tv_course_list_name);
                Toast.makeText(getActivity().getApplicationContext(),"you choosed "+tvCourseToastName.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void presentData() {
        presenter=new CourseListPresenter(this);
        presenter.setCourseListAdapter();

    }

    private void init(View rootView) {
        lvCourses = (ListView) rootView.findViewById(R.id.lvCourse);

    }
}
