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
        courses.add(course);

        Course course1=new Course();
        course1.setImage(R.drawable.logo);
        course1.setName("c++");
        course1.setCost(1000);
        courses.add(course1);

        Course course2=new Course();
        course2.setImage(R.drawable.logo);
        course2.setName("python");
        course2.setCost(2200);
        courses.add(course2);
    }

    public void setCourseListAdapter()
    {
        CourseListAdapter adapter=new CourseListAdapter(view.getActivity(),courses);
        view.lvCourses.setAdapter(adapter);
    }
}