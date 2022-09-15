package com.example.login_hy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        password = findViewById(R.id.passward);
        loginbutton = findViewById(R.id.buttonlogin);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = login.getText().toString();
                String pass =  password.getText().toString();
                if(username.equals("user") && (pass.equals("123456")))

                {
                    Toast.makeText(MainActivity.this, "Welcome harinder", Toast.LENGTH_SHORT).show();
                   Intent i = new  Intent(MainActivity.this,NewActivity.class);
                    startActivity(i);
                }else
                {
                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
                }




            }
        });

    }
}