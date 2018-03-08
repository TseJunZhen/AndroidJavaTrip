package com.victor.trip.javatrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText Name = (EditText) findViewById(R.id.etName);
        final EditText Mail = (EditText) findViewById(R.id.etMail);
        final EditText Age = (EditText) findViewById(R.id.etAge);
        final EditText Password = (EditText) findViewById(R.id.etPassword);
        final Button Login = (Button) findViewById(R.id.btnR);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(intent);
            }
        });
    }
}
