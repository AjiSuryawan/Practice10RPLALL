package com.example.practice10rplall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardMenu extends AppCompatActivity {
    // Bundle : satu set mekanisme untuk mengambil nilai yang dikirimkan pada Class DashboardMenu
    Bundle extras;
    String email;
    TextView tvemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_menu);
        tvemail = (TextView)findViewById(R.id.tvemail);
        extras = getIntent().getExtras();
        if (extras != null) {
            email = extras.getString("email");
            tvemail.setText(email);
        }



    }
}