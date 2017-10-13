package com.ranma.prj3.tugasketiga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity {
    private TextView txtNama,txtAlamat, txtTanggal,txtAgama,txtGender,txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        super.setTitle("Hasil");

        txtNama= (TextView) findViewById(R.id.txtNama);
        txtAlamat= (TextView) findViewById(R.id.txtAlamat);
        txtTanggal = (TextView) findViewById(R.id.txtTanggal);
        txtAgama  = (TextView) findViewById(R.id.txtAgama);
        txtGender = (TextView) findViewById(R.id.txtGender);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        Intent dataOut = getIntent();

        String nama = dataOut.getStringExtra("nama");
        String alamat = dataOut.getStringExtra("alamat");
        String tanggal = dataOut.getStringExtra("tanggal");
        String jeniskelamin = dataOut.getStringExtra("jeniskelamin");
        String agama = dataOut.getStringExtra("agama");
        String password = dataOut.getStringExtra("password");

        txtNama.setText("Nama\n"+nama);
        txtAlamat.setText("Alamat\n"+alamat);
        txtTanggal.setText("Tanggal\n"+tanggal);
        txtAgama.setText("Agama\n"+agama);
        txtGender.setText("Jenis Kelamin\n"+jeniskelamin);
        txtPassword.setText("Password\n"+password);

    }
}
