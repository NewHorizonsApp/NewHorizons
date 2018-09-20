package nti.newhorizons.newhorizons.view.fragment.profile;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;

import java.net.URL;

public class ProfilePresenter {
    Context context;

    public ProfilePresenter(Context context) {
        this.context = context;
    }public ProfilePresenter( ) {

    }

    public Intent getImage(){
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(intent.ACTION_GET_CONTENT);
        return intent;
    }


}
