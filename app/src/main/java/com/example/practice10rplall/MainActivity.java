package com.example.practice10rplall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // kita list semua object view yang sudah kita buat di layout
    // hanya dikenakan oeprasi
    EditText txtemail;
    EditText txtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // kita sambungkan ke layout
        txtemail = (EditText)findViewById(R.id.txtemail);
        txtpassword = (EditText)findViewById(R.id.txtpassword);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi disini
                String email = txtemail.getText().toString();
                String password = txtpassword.getText().toString();
                if (email.equalsIgnoreCase("admin@gmail.com")
                        && password.equalsIgnoreCase("123456")){
                    //sukses login, Toast
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Gagal Login gan !", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}