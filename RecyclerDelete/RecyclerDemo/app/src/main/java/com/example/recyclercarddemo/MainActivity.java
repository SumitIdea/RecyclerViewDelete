package com.example.recyclercarddemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);

        Model m1=new Model();
        m1.setImage(R.drawable.earphone);
        m1.setName("Sumit");
        m1.setAddress("Noida");
        arrayList.add(m1);

        Model m2=new Model();
        m2.setImage(R.mipmap.ic_launcher);
        m2.setName("Heena");
        m2.setAddress("Delhi");
        arrayList.add(m2);

        Model m3=new Model();
        m3.setImage(R.mipmap.ic_launcher);
        m3.setName("Shalini");
        m3.setAddress("U.P");
        arrayList.add(m3);

        Model m4=new Model();
        m4.setImage(R.mipmap.ic_launcher);
        m4.setName("Sam");
        m4.setAddress("U.P");
        arrayList.add(m4);

        Model m5=new Model();
        m5.setImage(R.mipmap.ic_launcher);
        m5.setName("Shalini");
        m5.setAddress("U.P");
        arrayList.add(m5);

        Model m6=new Model();
        m6.setImage(R.mipmap.ic_launcher);
        m6.setName("Shalini");
        m6.setAddress("U.P");
        arrayList.add(m6);

        Model m7=new Model();
        m7.setImage(R.mipmap.ic_launcher);
        m7.setName("Shalini");
        m7.setAddress("U.P");
        arrayList.add(m7);




        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(new MyAdapter(this,R.layout.recycler_design,arrayList));


    }
}