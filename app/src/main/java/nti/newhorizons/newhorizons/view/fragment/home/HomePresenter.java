package nti.newhorizons.newhorizons.view.fragment.home;

import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import nti.newhorizons.newhorizons.adapter.CategoryAdapter;
import nti.newhorizons.newhorizons.adapter.MostPopularAdapter;
import nti.newhorizons.newhorizons.adapter.VendorsAdapter;
import nti.newhorizons.newhorizons.data.entities.Course;
import nti.newhorizons.newhorizons.data.entities.Vendor;
import nti.newhorizons.newhorizons.data.entities.Category;
public class HomePresenter {
    private MostPopularAdapter adapter;
    private CategoryAdapter categoryAdapter;
    private ArrayList<Course> mostPopularCourses;
    private ArrayList<Course> suggestedCourses;

    private ArrayList<Category> CategoryCourses;
    private HomeFragment view;

    HomePresenter(HomeFragment view) {
        this.view = view;
        this.mostPopularCourses = new ArrayList<>();
        this.suggestedCourses = new ArrayList<>();
        this.CategoryCourses = new ArrayList<>();
    }



    public void setCategoryAdapter() {
        fillCategoryList();
        categoryAdapter = new CategoryAdapter(view.getActivity(), CategoryCourses);
        view.recyclerViewCategory.setLayoutManager(new LinearLayoutManager(view.getActivity(), LinearLayoutManager.HORIZONTAL, true));
        view.recyclerViewCategory.setAdapter(categoryAdapter);
    }


    public void setMostPopularAdapter() {
        fillMostPopularList();
        adapter = new MostPopularAdapter(view.getActivity(), mostPopularCourses);
        view.recyclerViewMostPopular.setLayoutManager(new LinearLayoutManager(view.getActivity(), LinearLayoutManager.HORIZONTAL, true));
        view.recyclerViewMostPopular.setAdapter(adapter);
    }

    public void setSuggestedAdapter() {
        fillSuggestedList();
        adapter = new MostPopularAdapter(view.getActivity(), suggestedCourses);
        view.recyclerViewSuggested.setLayoutManager(new LinearLayoutManager(view.getActivity(), LinearLayoutManager.HORIZONTAL, true));
        view.recyclerViewSuggested.setAdapter(adapter);
    }

    private void fillMostPopularList() {
        mostPopularCourses.add(new Course());
        mostPopularCourses.add(new Course());
        mostPopularCourses.add(new Course());

    }

    private void fillSuggestedList() {
        suggestedCourses.add(new Course());
        suggestedCourses.add(new Course());
        suggestedCourses.add(new Course());

    }


    public void fillCategoryList() {
        CategoryCourses.add(new Category());
        CategoryCourses.add(new Category());
        CategoryCourses.add(new Category());

    }
}
