package com.example.dam.pruebalistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityProva2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova2);
        ListView llista2 = (ListView) findViewById(R.id.llista2);
        List<Map<String, String>> dades = new ArrayList<>();
        Map<String, String> producte1 = new HashMap<>();
        producte1.put("Producte", "Disc dur 1TByte");
        producte1.put("Preu", "70€");
        dades.add(producte1);
        Map<String, String> producte2 = new HashMap<>();
        producte2.put("Producte", "Monitor 25'");
        producte2.put("Preu", "180€");
        dades.add(producte2);
        SimpleAdapter adapter = new SimpleAdapter(ActivityProva2.this, dades, android.R.layout.simple_list_item_2, new String[] {"Producte", "Preu"}, new int[] {android.R.id.text1, android.R.id.text2});
        llista2.setAdapter(adapter);
    }
}
