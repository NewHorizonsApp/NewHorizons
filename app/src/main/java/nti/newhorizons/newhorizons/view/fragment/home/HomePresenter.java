package nti.newhorizons.newhorizons.view.fragment.home;

import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import nti.newhorizons.newhorizons.adapter.MostPopularAdapter;

public class HomePresenter {
    private MostPopularAdapter adapter;
    private ArrayList<String> mostPopularCourses;
    private ArrayList<String> suggestedCourses;
    private HomeFragment view;

    HomePresenter(HomeFragment view) {
        this.view = view;
        this.mostPopularCourses = new ArrayList<>();
        this.suggestedCourses = new ArrayList<>();
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
        mostPopularCourses.add("C#");
        mostPopularCourses.add("C++");
        mostPopularCourses.add("Android");
        mostPopularCourses.add("IOS");
        mostPopularCourses.add("Back end");
    }

    private void fillSuggestedList() {
        suggestedCourses.add("english beginner");
        suggestedCourses.add("english advanced");
        suggestedCourses.add("cross platform");
        suggestedCourses.add("machine learning");
        suggestedCourses.add("Data strucuture");
    }


}
