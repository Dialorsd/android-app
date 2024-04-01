package com.example.my_proj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private Button menuActivityLogout;
    private Button menuActivityBtnEmployees;
    private TextView menuActivityName;
    private TextView menuActivitySurname;
    private TextView menuActivityEmail;
    private TextView menuActivityLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        menuActivityName = findViewById(R.id.menuActivityName);
        menuActivitySurname = findViewById(R.id.menuActivitySurname);
        menuActivityEmail = findViewById(R.id.menuActivityEmail);
        menuActivityLogin = findViewById(R.id.menuActivityLogin);
        menuActivityLogout = findViewById(R.id.menuActivityLogout);
        menuActivityBtnEmployees = findViewById(R.id.menuActivityBtnEmployees);

        String savedName = sharedPreferences.getString("name", "Name: --");
        String savedSurname = sharedPreferences.getString("surname", "Surname: --");
        String savedEmail = sharedPreferences.getString("email", "Email: --");
        String savedLogin = sharedPreferences.getString("login", "Login: --");
        menuActivityName.setText(savedName);
        menuActivitySurname.setText(savedSurname);
        menuActivityEmail.setText(savedEmail);
        menuActivityLogin.setText(savedLogin);

        menuActivityLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushToLogin();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("isAuthed", "false");
                editor.apply();
                finishAffinity();
            }
        });
        menuActivityBtnEmployees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushToWorkers();
            }
        });
    }
    private void pushToLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void pushToWorkers() {
        Intent intent = new Intent(this, WorkersActivity.class);
        startActivity(intent);
    }
}
