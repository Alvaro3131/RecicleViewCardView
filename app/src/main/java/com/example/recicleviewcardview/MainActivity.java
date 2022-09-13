package com.example.recicleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){
        elements=new ArrayList<>();
        elements.add(new ListElement("#775447","Pedro","Mexico","Cancelado"));
        elements.add(new ListElement("#607d8b","Alvaro","Peru","Activo"));
        elements.add(new ListElement("#03a9f4","Alejandro","Argentina","Cancelado"));
        elements.add(new ListElement("#f44336","Pablo","Uruguay","Cancelado"));
        elements.add(new ListElement("#775447","Pedro","Mexico","Activo"));

        ListAdapter listAdapter= new ListAdapter(elements, this);
        RecyclerView recyclerView= findViewById(R.id.listRecicleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}