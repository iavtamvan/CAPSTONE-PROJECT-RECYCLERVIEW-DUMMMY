package com.ariavgroup.aplikasi_pertama_capstone_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ariavgroup.aplikasi_pertama_capstone_project.adapter.HomeAdapter;
import com.ariavgroup.aplikasi_pertama_capstone_project.model.HomeDataModel;
import com.ariavgroup.aplikasi_pertama_capstone_project.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rv;
    private HomeAdapter homeAdapter;
    private List<HomeModel> homeModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        homeModels = new ArrayList<>();
        homeAdapter = new HomeAdapter(this, homeModels);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(homeAdapter);

        setData();

    }

    private void setData() {
        List<HomeModel> dummyData = HomeDataModel.groceryList();
        homeAdapter.updateData(dummyData);
    }

    private void initView() {
        rv = findViewById(R.id.rv);
    }
}