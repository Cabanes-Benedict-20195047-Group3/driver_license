package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class output extends AppCompatActivity {

    TextView pangalan, add_ress, dob, wkg, hm, nation_ality, restriction, blood_typ, s_ex, ecolor, textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        pangalan = findViewById(R.id.pangalan);
        add_ress = findViewById(R.id.add_ress);
        dob = findViewById(R.id.dob);
        wkg = findViewById(R.id.wkg);
        hm = findViewById(R.id.hm);
        nation_ality = findViewById(R.id.nation_ality);
        restriction = findViewById(R.id.restriction);
        blood_typ = findViewById(R.id.blood_typ);
        s_ex = findViewById(R.id.s_ex);
        ecolor = findViewById(R.id.ecolor);
        textView5 = findViewById(R.id.textView5);

        Intent intent = getIntent();


        String name = intent.getStringExtra("NAME");
        String a_ress = intent.getStringExtra("ADDRESS");
        String city = intent.getStringExtra("CITY");
        String address = a_ress+", "+city;
        String year = intent.getStringExtra("YEAR");
        String month = intent.getStringExtra("MONTH");
        String day = intent.getStringExtra("DAY");
        String BirthM = year+"/"+month+"/"+day;
        String weight = intent.getStringExtra("WEIGHT");
        String height = intent.getStringExtra("HEIGHT");
        String nationality = intent.getStringExtra("NATIONALITY");
        String restrict = intent.getStringExtra("RESTRICT");
        String b_type = intent.getStringExtra("BLOOD");
        String sex = intent.getStringExtra("SEX");
        String eyes = intent.getStringExtra("EYES");
        String driver = intent.getStringExtra("DRIVER");


        pangalan.setText(name);
        add_ress.setText(address);
        dob.setText(BirthM);
        wkg.setText(weight);
        hm.setText(height);
        nation_ality.setText(nationality);
        restriction.setText(restrict);
        blood_typ.setText(b_type);
        s_ex.setText(sex);
        ecolor.setText(eyes);
        textView5.setText(driver);


    }
}