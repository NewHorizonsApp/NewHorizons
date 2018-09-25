package nti.newhorizons.newhorizons.view.activity.signUp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.data.entities.Client;
import nti.newhorizons.newhorizons.view.activity.main.MainActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText nameT, phoneT, emailT, passwordT;
    Button signup;
    Client client;
    SignUpPresenter signUpPresenter;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        init();

        actions();


    }

    private void init() {
        nameT = findViewById(R.id.et_signup_name);
        phoneT = findViewById(R.id.et_signup_phone);
        emailT = findViewById(R.id.et_signup_name);
        passwordT = findViewById(R.id.et_signup_password);
        signup = findViewById(R.id.btn_signup);
        signUpPresenter=new SignUpPresenter();

        client=new Client();
    }

    private void actions() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkIsUserValid()) {
                    client=getClient();
                    if (signUpPresenter.saveClient(client)) {
                        Toast.makeText(SignUpActivity.this," Done ",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(SignUpActivity.this, MainActivity.class);
                        intent.putExtra("name",client.getPerson().getName());
                        startActivity(intent);
                    }
                }
            }
        });

    }

    private boolean checkIsUserValid() {


        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(nameT.getWindowToken(), 0);

        String user_name = nameT.getText().toString().trim();
        String user_phone = phoneT.getText().toString().trim();
        String user_email = emailT.getText().toString().trim();
        String user_password = passwordT.getText().toString().trim();

        nameT.setError(null);
        phoneT.setError(null);
        emailT.setError(null);
        passwordT.setError(null);




        boolean cancel = false;
        View focusView = null;

        if (TextUtils.isEmpty(user_password)) {
            passwordT.setError(getString(R.string.error_invalid_password));
            focusView = passwordT;
            cancel = true;
        }
        if (TextUtils.isEmpty(user_email)) {
            emailT.setError(getString(R.string.error_field_required));
            focusView = emailT;
            cancel = true;
        }else
        {
            if(!user_email.matches(emailPattern))
            {
                emailT.setError(getString(R.string.error_field_required));
                focusView = emailT;
                cancel = true;
            }
        }
            if (TextUtils.isEmpty(user_name)) {
            nameT.setError(getString(R.string.error_field_required));
            focusView = nameT;
            cancel = true;
        }
        if (TextUtils.isEmpty(user_phone)) {
            phoneT.setError(getString(R.string.error_field_required));
            focusView = phoneT;
            cancel = true;
        }

        if (cancel) {
            focusView.requestFocus();
        } else {
            return true;
        }
        return false;
    }
    private boolean saveUser() {
        //save local data base
        //save in web service
        return true;
    }

    private Client getClient(){

        String name = nameT.getText().toString().trim();
        String phone = phoneT.getText().toString().trim();
        String email = emailT.getText().toString().trim();
        String password = passwordT.getText().toString().trim();

        Client  client=new Client();
        client.getPerson().setName(name);
        client.getPerson().setPhone(phone);
        client.getPerson().setEmail(email);
        client.setPassword(password);
        return client;
    }
}