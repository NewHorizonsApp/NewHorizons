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

        client=new Client();
    }

    private void actions() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkIsUserValid()) {
                    if (saveUser()) {
                        Toast.makeText(SignUpActivity.this," Done ",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                    }
                }
            }
        });

    }

    private boolean checkIsUserValid() {


        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(nameT.getWindowToken(), 0);


        nameT.setError(null);
        phoneT.setError(null);
        emailT.setError(null);
        passwordT.setError(null);

        String user_name = nameT.getText().toString().trim();
        String user_phone = phoneT.getText().toString().trim();
        String user_email = emailT.getText().toString().trim();
        String user_password = passwordT.getText().toString().trim();


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
        } if (TextUtils.isEmpty(user_name)) {
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
}