package nti.newhorizons.newhorizons.view.fragment.ProfileCourse;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nti.newhorizons.newhorizons.R;

public class ProfileCourseFragment extends Fragment {
    ProfileCoursePresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile_course, container, false);

        init(rootView);
        presentData();
        actions();

        return rootView;
    }

    private void init(View rootView) {
    }

    private void actions() {
    }

    private void presentData() {
    }
}