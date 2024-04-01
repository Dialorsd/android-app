package com.example.my_proj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Button workersReturnToMenu;
        workersReturnToMenu = findViewById(R.id.workersReturnToMenu);

        List<Item> items = new ArrayList<Item>();
        for (int i = 1; i <= 10; i++) {
            String name = "Worker: " + i;
            String category;

            if (i % 2 == 0) {
                category = "Position: Frontend";
            } else {
                category = "Position: Backend";
            }

            float price = 10.0f + i;

            items.add(new Item(name, category, price));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

        workersReturnToMenu.setOnClickListener(new View.OnClickListener() {
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
