package com.example.my_proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button loginActivityBtnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginActivityBtnReg = findViewById(R.id.loginActivityBtnReg);
        loginActivityBtnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                onClickRegistration();
            }
        });
    }

    private void onClickRegistration() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}

