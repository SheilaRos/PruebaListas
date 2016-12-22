package com.example.dam.pruebalistas;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityProva4 extends AppCompatActivity {
    public class Product extends HashMap<String, Object>{
        public Product(int id, String name, float price, boolean inStock, int image){
            this.put("id", id);
            this.put("name", name);
            this.put("price", price);
            this.put("inStock", inStock);
            this.put("image", image);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova4);
        ListView llista4 = (ListView) findViewById(R.id.llista4);

        List<Product> dades = new ArrayList<>();
        dades.add(new Product(1, "Disc dur 1TByte", 70.0f, true, R.drawable.discdur));
        dades.add(new Product(2, "Monitor 25'", 179.99f, false, R.drawable.monitor));
        SimpleAdapter adapter = new SimpleAdapter(ActivityProva4.this, dades,
                R.layout.llista4_item, new String[] {"name", "price", "inStock", "image"},
                new int[] {R.id.nom, R.id.preu , R.id.stock, R.id.imatge});
        adapter.setViewBinder(new SimpleAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Object data, String textRepresentation) {
                if(view.getId() == R.id.stock){
                    TextView textView = (TextView) view;
                        if ((boolean) data){
                            textView.setText("En stock");
                            textView.setTextColor(Color.GREEN);
                        } else {
                            textView.setText("No disponible");
                            textView.setTextColor(Color.RED);
                        }
                        return true;
                    }
                return false;
            }
        });
        llista4.setAdapter(adapter);
    }
}
