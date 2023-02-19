package com.example.food_app_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.food_app_sample.Adapters.OrderAdapter;
import com.example.food_app_sample.Models.MainModel;
import com.example.food_app_sample.Models.OrderModel;
import com.example.food_app_sample.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(R.drawable.idle,"Idli","12","123455"));
        list.add(new OrderModel(R.drawable.appam,"Appam","35","123325"));
        list.add(new OrderModel(R.drawable.dosa,"Dosa","70","333455"));
        list.add(new OrderModel(R.drawable.dosa,"Dosa","70","333455"));
        list.add(new OrderModel(R.drawable.dosa,"Dosa","70","333455"));
        list.add(new OrderModel(R.drawable.dosa,"Dosa","70","333455"));
        list.add(new OrderModel(R.drawable.dosa,"Dosa","70","333455"));

        OrderAdapter adapter = new OrderAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}