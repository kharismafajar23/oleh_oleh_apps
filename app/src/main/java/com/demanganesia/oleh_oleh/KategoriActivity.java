package com.demanganesia.oleh_oleh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class KategoriActivity extends AppCompatActivity {

    ImageView ivMakanan, ivMinuman, ivKerajinan, ivPakaian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        ivMakanan = findViewById(R.id.btnMakanan);
        ivMinuman = findViewById(R.id.btnMinuman);
        ivKerajinan = findViewById(R.id.btnKerajinan);
        ivPakaian = findViewById(R.id.btnPakaian);

        //ke makanan activity
        ivMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keMakanan = new Intent(KategoriActivity.this, MakananActivity.class);
                startActivity(keMakanan);
            }
        });

        //ke minuman activity
        ivMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keMinuman = new Intent(KategoriActivity.this, MinumanActivity.class);
                startActivity(keMinuman);
            }
        });

        //ke kerajinan activity
        ivKerajinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keKerajinan = new Intent(KategoriActivity.this, KerajinanActivity.class);
                startActivity(keKerajinan);
            }
        });

        //ke pakaian activity
        ivPakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kePakaian = new Intent(KategoriActivity.this, PakaianActivity.class);
            }
        });
    }
}