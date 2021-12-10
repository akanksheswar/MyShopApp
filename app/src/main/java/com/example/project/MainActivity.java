package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton add_user;
    ExtendedFloatingActionButton action_fab;
    Boolean isAllFabsVisible;
    CardView records, update, items_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        records = findViewById(R.id.records);
        update = findViewById(R.id.update);
        items_photo = findViewById(R.id.item_list_photo);

        action_fab = findViewById(R.id.action_fab);
        add_user = findViewById(R.id.add_user);

        add_user.setVisibility(View.GONE);

        isAllFabsVisible = false;

        action_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isAllFabsVisible){
                    add_user.show();
                    isAllFabsVisible = true;
                }else{
                    add_user.hide();
                    isAllFabsVisible = false;
                }
            }
        });

        add_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "navigating to add customer activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, customer_add.class);
                startActivity(intent);
            }
        });

        records.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "navigating to records", Toast.LENGTH_SHORT).show();
//                Intent i =new Intent(MainActivity.this, record.class);
//                startActivity(i);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "navigating to update activity", Toast.LENGTH_SHORT).show();
//                Intent i1 = new Intent(MainActivity.this, update_file.class);
//                startActivity(i1);
            }
        });

        items_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "navigating to items list", Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(MainActivity.this, items_list_photo.class);
                startActivity(i2);
            }
        });
    }
}