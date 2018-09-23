package nti.newhorizons.newhorizons.view.fragment.about;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.view.fragment.home.HomePresenter;

public class AboutFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        init(rootView);
        actions();

        return rootView;

    }

    private void init(View rootView) {

    }

    private void actions() {
    }


}
