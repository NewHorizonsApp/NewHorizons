package nti.newhorizons.newhorizons.view.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nti.newhorizons.newhorizons.R;
import nti.newhorizons.newhorizons.view.activity.main.MainActivity;
import nti.newhorizons.newhorizons.view.activity.signUp.SignUpActivity;

public class LoginActivity extends AppCompatActivity {
    EditText email, password;
    Button login, signup, skip;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.et_user_mail);
        password = findViewById(R.id.et_user_password);
        signup = findViewById(R.id.btn_signup);
        login = findViewById(R.id.btn_login);
        skip = findViewById(R.id.btn_skip);

        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));

            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login_email = email.getText().toString().trim();
                String login_password = password.getText().toString().trim();

                if (checkIsUserValid())
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                else
                    Toast.makeText(LoginActivity.this, "login failed", Toast.LENGTH_SHORT).show();


            }
        });

    }

    private boolean checkIsUserValid() {
        //check data base
        return true;
    }
}