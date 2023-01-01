package com.example.sayan_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private TextView textView;
    private TextView TextView4;
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private EditText editTextNumber4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spino=findViewById(R.id.spinner_languages);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spino.setAdapter(adapter);
        getSupportActionBar().setTitle("Improved Disaster Responce With Machine Learning");

        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber4 = findViewById(R.id.editTextNumber4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Pressed", Toast.LENGTH_SHORT).show();
                String s = editTextNumber.getText().toString();

                String s1 = editTextNumber2.getText().toString();

                String s2 = editTextNumber4.getText().toString();

                if(s.isEmpty() || s1.isEmpty() || s2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Something", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(s);
                    int b = Integer.parseInt(s);
                    int c = Integer.parseInt(s);
                    Toast.makeText(MainActivity.this, "Value Stored Successfully !", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}