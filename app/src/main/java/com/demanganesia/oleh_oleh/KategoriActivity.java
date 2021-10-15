package com.demanganesia.oleh_oleh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class KategoriActivity extends AppCompatActivity {

    ImageButton makananBtn, minumanBtn, kerajinanBtn, pakaianBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        makananBtn = findViewById(R.id.btnMakanan);
        minumanBtn = findViewById(R.id.btnMinuman);
        kerajinanBtn = findViewById(R.id.btnKerajinan);
        pakaianBtn = findViewById(R.id.btnPakaian);

        //pindah ke makanan activity
        makananBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMakanan = new Intent(KategoriActivity.this, MakananActivity.class);
                startActivity(keMakanan);
                finish();
            }
        });
    }
}