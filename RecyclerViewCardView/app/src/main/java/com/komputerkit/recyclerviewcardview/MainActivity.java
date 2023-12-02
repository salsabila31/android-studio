package com.komputerkit.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public  void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Siti", "Malang"));
        siswaList.add(new Siswa("Eko", "Surabaya"));
        siswaList.add(new Siswa("Alan", "Bogor"));
        siswaList.add(new Siswa("Dwi", "Bekasi"));
        siswaList.add(new Siswa("Dina", "Tangerang"));
        siswaList.add(new Siswa("Fara", "Surabaya"));
        siswaList.add(new Siswa("Kiki", "Sidoarjo"));
        siswaList.add(new Siswa("Caca", "Gresik"));
        siswaList.add(new Siswa("Kiya", "Jerman"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Alki", "Cirebon"));
        adapter.notifyDataSetChanged();
    }
}