package nti.newhorizons.newhorizons.view.fragment.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import nti.newhorizons.newhorizons.R;

public class HomeFragment extends Fragment {
    ImageView imageViewLogo;
    RecyclerView recyclerViewMostPopular;
    RecyclerView recyclerViewSuggested;
    HomePresenter presenter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        init(rootView);
        presentData();
        actions();

        return rootView;

    }

    private void presentData() {
        presenter = new HomePresenter(this);
        presenter.setMostPopularAdapter();
        presenter.setSuggestedAdapter();
    }

    private void init(View rootView) {
        imageViewLogo = rootView.findViewById(R.id.imageView_logo);
        recyclerViewMostPopular = rootView.findViewById(R.id.rv_mostPopular);
        recyclerViewSuggested = rootView.findViewById(R.id.rv_suggested);
    }

    private void actions() {
    }


}
