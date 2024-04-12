 package com.prithviraj.carsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

 public class MainActivity extends AppCompatActivity {
    // Adapter View : Recycler View
    RecyclerView recyclerView;
    // Create the data source
     CarModel[] cars;
     // Adapter
     MyAdapter myAdapter;

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
        recyclerView=findViewById(R.id.recyclerView);
        cars=new CarModel[]{
                new CarModel("Hyundai Creta",R.drawable.creta),
                new CarModel("Tata Nexon",R.drawable.nexon),
                new CarModel("Kia Sonet",R.drawable.sonet),
                new CarModel("Maruti Suzuki Brezza",R.drawable.brezza),
                new CarModel("Skoda Kushaq",R.drawable.kushaq),
        };
        //adapter
        myAdapter=new MyAdapter(cars);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);


    }
}