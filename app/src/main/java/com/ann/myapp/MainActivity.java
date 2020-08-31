package com.ann.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView btnJadwal;
    CardView btnGaleri;
    CardView btnStore;
    CardView btnLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJadwal = (CardView)findViewById(R.id.btn_jadwal);
        btnJadwal.setOnClickListener(this);
        btnGaleri = (CardView)findViewById(R.id.btn_galeri);
        btnGaleri.setOnClickListener(this);
        btnStore = (CardView)findViewById(R.id.btn_shop);
        btnStore.setOnClickListener(this);
        btnLive = (CardView)findViewById(R.id.btn_live);
        btnLive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.btn_jadwal:
                i = new Intent(MainActivity.this,ScheduleActivity.class);
                startActivity(i);
                break;
            case R.id.btn_galeri:
                i = new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(i);
                break;
            case R.id.btn_shop:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smglobalshop.com/collections/exo"));
                startActivity(i);
                break;
            case R.id.btn_live:
                i = new Intent(MainActivity.this,LiveActivity.class);
                startActivity(i);
                break;
        }
    }
}