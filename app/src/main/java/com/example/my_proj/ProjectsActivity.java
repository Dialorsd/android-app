package com.example.my_proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProjectsActivity extends AppCompatActivity {

    Button projectsReturnToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        projectsReturnToMenu = findViewById(R.id.projectsReturnToMenu);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewProjects);

        List<Item> items = new ArrayList<Item>();
        for (int i = 1; i <= 10; i++) {
            String name = "Name: Project " + i;
            String category = "Workers: ";
            float price = i;

            items.add(new Item(name, category, price));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
        projectsReturnToMenu.setOnClickListener(new View.OnClickListener() {
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
