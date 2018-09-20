package nti.newhorizons.newhorizons.view.fragment.profile;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import nti.newhorizons.newhorizons.R;


public class ProfileFragment extends Fragment {
    ProfilePresenter profilePresenter;

    TextView nameT, personalT, currentT, finishT, interstedT;
    ImageView addIMG, profileIMG;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        init(rootView);
        presentData();
        actions();

        return rootView;
    }

    private void init(View view) {

        nameT = view.findViewById(R.id.tv_profile_name);

        currentT = view.findViewById(R.id.tv_profile_current);
        personalT = view.findViewById(R.id.tv_profile_personalInfo);
        finishT = view.findViewById(R.id.tv_profile_fiinished);
        interstedT = view.findViewById(R.id.tv_profile_interested);

        profileIMG = view.findViewById(R.id.profile_image);
        addIMG = view.findViewById(R.id.profile_addIMG);

        profilePresenter = new ProfilePresenter();
    }

    private void actions() {
        currentT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        finishT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        interstedT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        personalT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
 
        addIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int permissionCheck = ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.READ_EXTERNAL_STORAGE);

                if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
                    startGallery();
                } else {
                    ActivityCompat.requestPermissions(getActivity(),
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            2000);
                }
            }
        });


    }


    private void presentData() {

    }


    public void startGallery() {
        Intent cameraIntent = new Intent(Intent.ACTION_GET_CONTENT);
        cameraIntent.setType("image/*");
        if (cameraIntent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivityForResult(cameraIntent, 1000);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            if (resultCode == Activity.RESULT_OK) {
                if (requestCode == 1000) {
                    Uri returnUri = data.getData();
                    Bitmap bitmapImage = null;

                    bitmapImage = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), returnUri);
                    profileIMG.setImageBitmap(bitmapImage);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}