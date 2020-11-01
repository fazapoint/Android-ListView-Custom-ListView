package com.example.latihan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] mahasiswa = {"Anisykurli Faza Ramadhani","Muhammad Fida Haq","Salsabila Ayu Syafiqa","Ana Setyaningrum","Lintang Tumitis","Rahardian Alamsyah","Aditya Dwi Rangga","Yusuf Alfiannur","Tiara Dinda","Muhammad Agan","Adnanta Zulfakar","Ardan Fakhriza","Riyan Jericho","Ilham Maulana AKbar","Marah Nafisah"};

    private ListView lv_mahasiswa;
    private ArrayAdapter<String> mahasiswaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mahasiswaAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mahasiswa);

        lv_mahasiswa = findViewById(R.id.lv_mahasiswa);
        lv_mahasiswa.setAdapter(mahasiswaAdapter);

    }
}
