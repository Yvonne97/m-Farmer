package yvonne.a89033.lulusdfms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = findViewById(R.id.register);
        register.setOnClickListener(View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(Login.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
