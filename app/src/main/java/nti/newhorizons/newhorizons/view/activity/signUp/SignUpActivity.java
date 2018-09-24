package nti.newhorizons.newhorizons.view.activity.signUp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.view.activity.login.LoginActivity;
import nti.newhorizons.newhorizons.view.activity.main.MainActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText name, phone, email, password;
    Button signup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//init();
        name = (EditText) findViewById(R.id.et_name);
        phone = (EditText) findViewById(R.id.et_Phone);
        email = (EditText) findViewById(R.id.et_email);
        password = (EditText) findViewById(R.id.et_password);
        signup = (Button) findViewById(R.id.btn_signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_email = email.getText().toString().trim();
                String user_password = password.getText().toString().trim();


                if (saveUser()) {
                    startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                }

            }
        });


    }

    private boolean saveUser() {
        //save local data base
        //save in web service
        return true;
    }
}