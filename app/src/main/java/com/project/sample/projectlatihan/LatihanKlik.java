package com.project.sample.projectlatihan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LatihanKlik extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan_event);

        Button btn3 = findViewById(R.id.btn3);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("LISTENER", "udah di eksekusi nih" );
                Toast.makeText(getApplicationContext(), "Udah Di Eksekusi nih",
                        Toast.LENGTH_SHORT).show();
            }
        };
        btn3.setOnClickListener(listener);

        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    public void pencet(View v){
        Log.e("PENCET", "udah di pencet nih" );
        Toast.makeText(this, "Udah dipencet nih", Toast.LENGTH_SHORT).show();
    }
    public void pencet2(View v){
        Log.e("PENCET2", "udah di pencet nih" );
        Toast.makeText(this, "Udah dipencet nih", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn4 :
                Toast.makeText(this, "menggunakan implementasi listener 1",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5 :
                Toast.makeText(this, "menggunakan implementasi listener 2",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6 :
                Toast.makeText(this, "menggunakan implementasi listener 3",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
