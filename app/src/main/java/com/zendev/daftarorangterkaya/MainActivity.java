package com.zendev.daftarorangterkaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeople;
    private ArrayList<People> list =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPeople = findViewById(R.id.rv_people);
        rvPeople.setHasFixedSize(true);

        list.addAll(PeopleData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        ListPeopleAdapter listPeopleAdapter = new ListPeopleAdapter(this);
        listPeopleAdapter.setListPeople(list);
        rvPeople.setAdapter(listPeopleAdapter);
    }
}
