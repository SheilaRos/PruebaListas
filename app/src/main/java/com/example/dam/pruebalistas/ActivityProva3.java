package com.example.dam.pruebalistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityProva3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova3);
        ListView llista3 = (ListView) findViewById(R.id.llista3);
        List<Map<String, String>> dades = new ArrayList<>();
        Map<String, String> producte1 = new HashMap<>();
        producte1.put("Producte", "Disc dur 1TByte");
        producte1.put("Stock", "disponible en stock");
        producte1.put("Preu", "70€");
        dades.add(producte1);
        Map<String, String> producte2 = new HashMap<>();
        producte2.put("Producte", "Monitor 25'");
        producte2.put("Stock", "No disponible fins el 04/02/2017");
        producte2.put("Preu", "180€");
        dades.add(producte2);
        SimpleAdapter adapter = new SimpleAdapter(ActivityProva3.this, dades, R.layout.llista3_item, new String[] {"Producte", "Preu", "Stock"}, new int[] {R.id.nom, R.id.preu, R.id.stock});
        llista3.setAdapter(adapter);
    }
}
