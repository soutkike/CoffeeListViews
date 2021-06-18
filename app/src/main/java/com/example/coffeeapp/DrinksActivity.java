package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {
ListView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] datos = new String[]{"Frapuccino","Capuccino","Black Coffee"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        menu = (ListView)findViewById(R.id.menu);
        menu.setAdapter(adaptador);
        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mensaje= String.valueOf(menu.getItemAtPosition(position));

                openActivity(mensaje);

            }
        });
    }


    public void openActivity(String mensaje){
        Intent intent = new Intent(this,ProductActivity.class);
        intent.putExtra("PRODUCT_NAME",mensaje);
        startActivity(intent);
    }
}