package nti.newhorizons.newhorizons.view.fragment.home;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.data.entities.Course;

public class HomeFragment extends Fragment {
    ImageView imageViewLogo;
    RecyclerView recyclerViewCategory;
    RecyclerView recyclerViewMostPopular;
    RecyclerView recyclerViewSuggested;
    HomePresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        init(rootView);
        actions();

        return rootView;

    }

    private void init(View rootView) {
        imageViewLogo = rootView.findViewById(R.id.imageView_logo);
        recyclerViewCategory = rootView.findViewById(R.id.rv_category);
        recyclerViewMostPopular = rootView.findViewById(R.id.rv_mostPopular);
        recyclerViewSuggested = rootView.findViewById(R.id.rv_suggested);
        presenter = new HomePresenter(this);
    }

    private void actions() {


    }


}
