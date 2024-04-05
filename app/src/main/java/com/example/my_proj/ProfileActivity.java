package com.example.my_proj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {
    private Button profileActivityBtnBack;
    private TextView profileName, profileLogin, profileEmail, profileSurname;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        String savedName = sharedPreferences.getString("name", "--");
        String savedSurname = sharedPreferences.getString("surname", "--");
        String savedEmail = sharedPreferences.getString("email", "--");
        String savedLogin = sharedPreferences.getString("login", "--");
        profileName = findViewById(R.id.profileName);
        profileLogin = findViewById(R.id.profileLogin);
        profileEmail = findViewById(R.id.profileEmail);
        profileSurname = findViewById(R.id.profileSurname);
        profileName.setText("Name: " + savedName);
        profileLogin.setText("Login: " + savedLogin);
        profileEmail.setText("Email: " + savedEmail);
        profileSurname.setText("Surname: " + savedSurname);

        profileActivityBtnBack = findViewById(R.id.profileActivityBtnBack);

        profileActivityBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushToMenu();
            }
        });
    }
    private void pushToMenu() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
