package nti.newhorizons.newhorizons.view.fragment.courses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nti.newhorizons.newhorizons.R;

public class CoursesFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_courses, container, false);

        init(rootView);
        presentData();
        actions();
        
        return rootView;
    }

    private void actions() {
    }

    private void presentData() {
    }

    private void init(View rootView) {
    }
}
