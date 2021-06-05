
package com.example.driverslicense;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout btype, sex, eyecolor;
    private AutoCompleteTextView dropdown, sdropdwon, eyeoption;
    private TextInputLayout name, address, city, nationality, year, month, day, weight, height;
    private CheckBox r_1, r_2, r_3, r_4, r_5, r_6, r_7, r_8;
    private TextView res;
    private Button sub_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btype = findViewById(R.id.btype);
        dropdown = findViewById(R.id.dropdown);
        sex = findViewById(R.id.sex);
        sdropdwon = findViewById(R.id.sdropdown);
        eyecolor = findViewById(R.id.eyecolor);
        eyeoption = findViewById(R.id.eyeoption);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        nationality = findViewById(R.id.nationality);
        year = findViewById(R.id.year);
        month = findViewById(R.id.month);
        day = findViewById(R.id.day);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        r_1 = findViewById(R.id.r_1);
        r_2 = findViewById(R.id.r_2);
        r_3 = findViewById(R.id.r_3);
        r_4 = findViewById(R.id.r_4);
        r_5 = findViewById(R.id.r_5);
        r_6 = findViewById(R.id.r_6);
        r_7 = findViewById(R.id.r_7);
        r_8 = findViewById(R.id.r_8);
        res = findViewById(R.id.res);
        sub_btn = findViewById(R.id.sub_btn);


        String[] items = new String[]{
                "A",
                "B",
                "AB",
                "O",
                "A+",
                "B+",
                "AB+",
                "O+",
                "A-",
                "B-",
                "AB-",
                "O-"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, items);
        dropdown.setAdapter(adapter);


        String[] option = new String[]{
                "Male",
                "Female"
        };
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, option);
        sdropdwon.setAdapter(adapter1);

        String[] eoption = new String[]{
                "BLACK",
                "BROWN",
                "BLUE",
                "HAZEL",
                "OTHER"
        };
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, eoption);
        eyeoption.setAdapter(adapter2);

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbmt_btn();
            }
        });
    }

    private boolean validate_name() {
        if (name.getEditText().getText().toString().trim().isEmpty()) {
            name.setError("Field can't be empty!");
            return false;
        } else {
            name.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_address() {
        if (address.getEditText().getText().toString().trim().isEmpty()) {
            address.setError("Field can't be empty!");
            return false;
        } else {
            address.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_city() {
        if (city.getEditText().getText().toString().trim().isEmpty()) {
            city.setError("Field can't be empty!");
            return false;
        } else {
            city.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_nationality() {
        if (nationality.getEditText().getText().toString().trim().isEmpty()) {
            nationality.setError("Field can't be empty!");
            return false;
        } else {
            nationality.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_year() {
        if (year.getEditText().getText().toString().trim().isEmpty()) {
            year.setError("!");
            return false;
        } else if (year.getEditText().getText().toString().trim().length() > 4 || year.getEditText().getText().toString().trim().length() < 4 ) {
            year.setError("!");
            return false;
        } else {
            year.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_month() {
        if (month.getEditText().getText().toString().trim().isEmpty()) {
            month.setError("!");
            return false;
        } else if (month.getEditText().getText().toString().trim().length() > 2 ) {
            month.setError("!");
            return false;
        } else {
            month.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_day() {
        if (day.getEditText().getText().toString().trim().isEmpty()) {
            day.setError("!");
            return false;
        } else if (day.getEditText().getText().toString().trim().length() > 2 ) {
            day.setError("!");
            return false;
        } else {
            day.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_weight() {
        if (weight.getEditText().getText().toString().trim().isEmpty()) {
            weight.setError("Required!");
            return false;
        } else {
            weight.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_height() {
        if (height.getEditText().getText().toString().trim().isEmpty()) {
            height.setError("Required!");
            return false;
        } else {
            height.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_restriction() {
        if (r_1.isChecked() | r_2.isChecked() | r_3.isChecked() | r_4.isChecked() | r_5.isChecked() | r_6.isChecked() | r_7.isChecked() | r_8.isChecked()){
            return true;
        } else {
            return false;
        }
    }

    private boolean validate_btype() {
        if (btype.getEditText().getText().toString().trim().isEmpty()) {
            btype.setError("Required!");
            return false;
        } else {
            btype.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_sex() {
        if (sex.getEditText().getText().toString().trim().isEmpty()) {
            sex.setError("Required!");
            return false;
        } else {
            sex.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validate_eyes() {
        if (eyecolor.getEditText().getText().toString().trim().isEmpty()) {
            eyecolor.setError("Required!");
            return false;
        } else {
            eyecolor.setErrorEnabled(false);
            return true;
        }
    }



    public void sbmt_btn() {

        if (!validate_name() | !validate_address() | !validate_city() | !validate_nationality() | !validate_year() | !validate_month() | !validate_day() | !validate_weight() | !validate_height() | !validate_btype() | !validate_sex() | !validate_eyes()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Information!").setMessage("Register Failed!, Please check again your form!").setPositiveButton("Ok",null);
            AlertDialog alert = builder.create();
            alert.show();
                res.setText(null);
            if (!validate_restriction()){
                res.setText("Please Fill your RESTRICTION, atleast one!!");
            }

        }
        else{

            String uname = name.getEditText().getText().toString().trim();
            String udress = address.getEditText().getText().toString().trim();
            String ucity = city.getEditText().getText().toString().trim();
            String uyear = year.getEditText().getText().toString().trim();
            String umonth = month.getEditText().getText().toString().trim();
            String uday = day.getEditText().getText().toString().trim();
            String uweight = weight.getEditText().getText().toString().trim();
            String uheight = height.getEditText().getText().toString().trim();
            String unality = nationality.getEditText().getText().toString().trim();

            StringBuffer result = new StringBuffer();
            String textView = "";
            if (r_1.isChecked()){
                result.append(r_1.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_2.isChecked()){
                result.append(", " + r_2.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_3.isChecked()){
                result.append(", " + r_3.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_4.isChecked()){
                result.append(", " + r_4.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_5.isChecked()){
                result.append(", " + r_5.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_6.isChecked()){
                result.append(", " + r_6.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_7.isChecked()){
                result.append(", " + r_7.getText().toString());
                textView = "NON-PROFESSIONAL DRIVER'S LICENSE";
            }if (r_8.isChecked()){
                result.append(", " + r_8.getText().toString());
                textView = "PROFESSIONAL DRIVER'S LICENSE";
            }

            String restriction = result.toString();
            String bld_type = btype.getEditText().getText().toString().trim();
            String s_ex = sex.getEditText().getText().toString().trim();
            String eyes = eyecolor.getEditText().getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, output.class);

            intent.putExtra("NAME", uname);
            intent.putExtra("ADDRESS", udress);
            intent.putExtra("CITY", ucity);
            intent.putExtra("YEAR", uyear);
            intent.putExtra("MONTH", umonth);
            intent.putExtra("DAY", uday);
            intent.putExtra("WEIGHT", uweight);
            intent.putExtra("HEIGHT", uheight);
            intent.putExtra("NATIONALITY", unality);
            intent.putExtra("RESTRICT" , restriction);
            intent.putExtra("BLOOD", bld_type);
            intent.putExtra("SEX", s_ex);
            intent.putExtra("EYES", eyes);
            intent.putExtra("DRIVER", textView);

            startActivity(intent);
        }
    }
}
