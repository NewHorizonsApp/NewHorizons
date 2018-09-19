package nti.newhorizons.newhorizons.view.fragment.courseList;

import java.util.ArrayList;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.adapter.CourseListAdapter;
import nti.newhorizons.newhorizons.data.entities.Course;

public class CourseListPresenter {
    ArrayList<Course> courses;
    CourseListFragment view;
    CourseListAdapter adapter;


    public CourseListPresenter(CourseListFragment courseListFragment) {
        courses=new ArrayList<>();
        view=courseListFragment;

        Course course=new Course();
        course.setImage(R.drawable.course_dummy);
        course.setName("java");
        course.setCost(557);

    }

    public void setCourseListAdapter()
    {
        CourseListAdapter adapter=new CourseListAdapter(view.getActivity(),courses);
        view.lvCourses.setAdapter(adapter);
    }
}
