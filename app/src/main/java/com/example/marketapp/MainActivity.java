package com.example.marketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.ArrayDeque;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    RecyclerView recyclerView;
    List<Item> itemList;
    MyCustomAdatper customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // 1 AdapterView : RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        // 2 - DataList
       itemList = new ArrayList<>();


       Item fruits = new Item(R.drawable.fruit, "Fruits", "Fresh Fruits from Garden");
       Item vegetables = new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables");
       Item bread = new Item(R.drawable.bread, "Bakery", "Bread and Beans");
       Item beverage = new Item(R.drawable.beverage, "Beverae", "Juice, Tea, Coffee and Soda");
       Item milk = new Item(R.drawable.milk, "Dairy", "Milk, Shakes and Yogurt");
       Item popcorn = new Item(R.drawable.popcorn, "Snacks", "Popcorn");

       itemList.add(fruits);
       itemList.add(vegetables);
       itemList.add(bread);
       itemList.add(beverage);
       itemList.add(milk);
       itemList.add(popcorn);

       //creating LinearLayoutManager to handle the items vertically in recycler view

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


       // 3 - initializing Custom Adapter
        customAdapter = new MyCustomAdatper(itemList);
        recyclerView.setAdapter(customAdapter);
        customAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this,
                "You Chose: "+ itemList.get(pos).getItemName(),
                Toast.LENGTH_SHORT).show();
    }
}