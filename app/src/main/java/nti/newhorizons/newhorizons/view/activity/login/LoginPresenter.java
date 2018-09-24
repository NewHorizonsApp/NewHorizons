package nti.newhorizons.newhorizons.view.activity.login;

import android.view.View;
import android.widget.Toast;


import nti.newhorizons.newhorizons.data.entities.Client;

public class LoginPresenter {

    View context;

    public LoginPresenter(View context) {

        this.context = context;
    }

    public LoginPresenter() {
    }


    public Client getUser(String email, String password) {
        Client user = new Client();


        if (email != null) {
            user.getPerson().setEmail(email);
        } else {
            Toast.makeText(new LoginActivity(), "You should enter Email", Toast.LENGTH_SHORT).show();
        }
        if (password != null) {
            user.setPassword(password);
        } else {
            Toast.makeText(new LoginActivity(), "You should enter pass", Toast.LENGTH_SHORT).show();
        }
        return user;
    }

}
