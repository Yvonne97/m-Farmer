package yvonne.a89033.lulusdfms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    EditText fname, lname, email, phone, password, confirmPass;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //casting
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        confirmPass = findViewById(R.id.pass_confirm);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fnameString = fname.getText().toString();
                String lnameString = lname.getText().toString();
                String emailString = email.getText().toString();
                String phoneString = phone.getText().toString();
                String passString = password.getText().toString();
                String confpassString = confirmPass.getText().toString();

                if(passString.equals(confpassString)){
                    registerUser(emailString, passString);
                }
            }
        });


    }

    private void registerUser(String emailString, String passString) {
    }
}
