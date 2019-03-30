package com.zendev.daftarorangterkaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewPeople extends AppCompatActivity {

    public static final String EXTRA_PEOPLE = "extra_people";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_IMG = "extra_img";

    TextView tvNama, tvDeskripsi;
    ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_people);

        tvNama = findViewById(R.id.tv_nama);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        ivGambar = findViewById(R.id.iv_gambar);

        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String people = getIntent().getStringExtra(EXTRA_PEOPLE);

        tvNama.setText(people);
        tvDeskripsi.setText(deskripsi);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_IMG))
                .into(ivGambar);
    }
}
