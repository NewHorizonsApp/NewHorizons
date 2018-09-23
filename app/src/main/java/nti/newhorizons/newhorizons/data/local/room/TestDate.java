package nti.newhorizons.newhorizons.data.local.room;

import java.util.ArrayList;
import java.util.List;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.data.entities.Category;
import nti.newhorizons.newhorizons.data.entities.Course;

public class TestDate {

    public static List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setId(i);
            course.setName("name"+i);
            course.setCategory("C#");
            courses.add(course);
        }



        return courses;
    }

    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setImage(R.drawable.logo);
        category.setName("python");
        categories.add(category);


        category = new Category();
        category.setImage(R.drawable.microsoft);
        category.setName("C#");
        categories.add(category);

        return categories;

    }
}