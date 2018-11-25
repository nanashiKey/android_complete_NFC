package com.project.sample.projectlatihan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TampilList extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan_list);
        setKonten();
    }

    public void setKonten(){
        lv = findViewById(R.id.list_data);
        List<String> data = new ArrayList<>();
        data.add("File ke 1");
        data.add("File ke 2");
        data.add("File ke 3");
        data.add("File ke 4");
        data.add("File ke 5");
        data.add("File ke 6");
        data.add("File ke 7");
        data.add("File ke 8");
        data.add("File ke 9");
        data.add("File ke 10");
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);
    }
}
