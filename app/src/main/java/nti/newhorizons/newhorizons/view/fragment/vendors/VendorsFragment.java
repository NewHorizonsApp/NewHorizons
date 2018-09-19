package nti.newhorizons.newhorizons.view.fragment.vendors;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import nti.newhorizons.newhorizons.R;

public class VendorsFragment  extends Fragment {
    VendorsPresenter presenter;
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vendors, container, false);

        init(rootView);
        presentData();
        actions();

        return rootView;
    }

    private void actions() {
    }

    private void presentData() {
        presenter=new VendorsPresenter(this);
        presenter.setVendorsAdapter();
    }

    private void init(View rootView) {
        gridView = (GridView) rootView.findViewById (R.id.grid_view_vendor);

    }
}
