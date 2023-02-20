package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textTable;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTable = findViewById(R.id.textTable);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textTable.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, R.string.wrong, Toast.LENGTH_LONG).show();
                else {
                    EAdditives esh = new EAdditives();
                    esh.initial();
                    String text = textTable.getText().toString();
                   String s = String.valueOf(esh.wtf(text));
                    result.setText(s);

                }

            }



        });
    }

        }





