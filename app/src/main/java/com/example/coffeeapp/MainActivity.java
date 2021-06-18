package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] datos = new String[]{"Food","Drinks","Stores"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        menu = (ListView)findViewById(R.id.menu);
        menu.setAdapter(adaptador);
        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mensaje= String.valueOf(menu.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
                openActivity(mensaje);

            }
        });

    }

    public void openActivity(String selectedItem){
        Intent intent=null;
        switch (selectedItem){
            case "Food":
                intent = new Intent(this,FoodActivity.class);
                break;
            case "Drinks":
                intent = new Intent(this,DrinksActivity.class);
                break;
            case "Stores":
                intent = new Intent(this,StoresActivity.class);
                break;

        }
        startActivity(intent);
    }


}