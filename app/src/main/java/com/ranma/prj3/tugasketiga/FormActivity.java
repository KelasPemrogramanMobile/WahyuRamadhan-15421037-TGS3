package com.ranma.prj3.tugasketiga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class FormActivity extends AppCompatActivity {
    private Button btnSimpan;
    private EditText txtNama, txtAlamat, txtTanggal,txtPass;
    private Spinner spAgama;
    private RadioButton radionButton;
    private RadioGroup rgGender;
    String nama,alamat,tanggal,jeniskelamin,agama,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btnSimpan = (Button) findViewById(R.id.btnSimpan);
        txtNama = (EditText) findViewById(R.id.txtNama);
        txtAlamat = (EditText) findViewById(R.id.txtAlamat);
        txtTanggal = (EditText) findViewById(R.id.txtTanggal);
        spAgama = (Spinner) findViewById(R.id.spAgama);
        rgGender = (RadioGroup) findViewById(R.id.rgGender);
        txtPass = (EditText) findViewById(R.id.txtPass);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pilih radio buttonnya di grup radio
                int idyangkepilih = rgGender.getCheckedRadioButtonId();
                //cari radio button
                radionButton = (RadioButton) findViewById(idyangkepilih);
                nama = txtNama.getText().toString();
                alamat = txtAlamat.getText().toString();
                tanggal = txtTanggal.getText().toString();
                agama = spAgama.getSelectedItem().toString();
                jeniskelamin = radionButton.getText().toString();
                password = txtPass.getText().toString();

                Intent keHasil = new Intent(FormActivity.this, homeActivity.class);
                keHasil.putExtra("nama",nama);
                keHasil.putExtra("alamat",alamat);
                keHasil.putExtra("tanggal",tanggal);
                keHasil.putExtra("agama",agama);
                keHasil.putExtra("jeniskelamin",jeniskelamin);
                keHasil.putExtra("password",password);
                startActivity(keHasil);
                finish();

            }
        });
    }
}
