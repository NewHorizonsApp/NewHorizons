package nti.newhorizons.newhorizons.view.fragment.courses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.view.fragment.category.CategoryFragment;
import nti.newhorizons.newhorizons.view.fragment.vendors.VendorsFragment;

public class CoursesFragment extends Fragment{
    @Nullable
    CoursesPresenter coursesPresenter;
    private LinearLayout linearLayout1,linearLayout2;
    private ImageView imageView1,imageView2;
    VendorsFragment vendorsFragment=new VendorsFragment();
    CategoryFragment categoryFragment=new CategoryFragment();
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_courses, container, false);
        View rootView1 = inflater.inflate(R.layout.fragment_vendors_selection, container, false);
        coursesPresenter=new CoursesPresenter();

        init(rootView);
        presentData();
        /*   actions();
         */
        return rootView;
    }
    /*
        private void actions() {
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    swapFragment(1);
                    Toast.makeText(getActivity().getBaseContext(),"1111",Toast.LENGTH_LONG).show();

                }
            });

            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    swapFragment(2);
                    Toast.makeText(getActivity().getBaseContext(),"2222",Toast.LENGTH_LONG).show();


                }
            });

        }
    */
    private void presentData() {

    }

    private void init(View rootView) {
        swapFragment();
    }

    private void swapFragment(){

        FragmentTransaction fragmentTransaction =getActivity().getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.lyfragment1, new VendorsSelection());
        fragmentTransaction.replace(R.id.lyfragment2, new CatogrysSelection());

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}