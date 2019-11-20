package com.raziv.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNo, etSecNo;
    RadioButton rdoadd, rdosub, rdomul, rdodiv;
    Button btnCalculate;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNo = findViewById(R.id.etFirstNo);
        etSecNo = findViewById(R.id.etSecNo);

        rdoadd = findViewById(R.id.rdoadd);
        rdosub = findViewById(R.id.rdosub);
        rdomul = findViewById(R.id.rdomul);
        rdodiv = findViewById(R.id.rdodiv);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second;

                first= Integer.parseInt(etFirstNo.getText().toString());
                second =Integer.parseInt(etSecNo.getText().toString());

                if (rdoadd.isChecked()){
                    result = first + second;
                }
                else if(rdosub.isChecked()){
                    result = first - second;
                }
                else if (rdomul.isChecked()){
                    result = first * second;
                }
                else if (rdodiv.isChecked()){
                    result = first / second;
                }
                Toast.makeText(MainActivity.this, git"The Result is "  + result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

