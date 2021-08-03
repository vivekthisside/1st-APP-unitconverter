package com.example.vivekunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView3;
private EditText editText12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        editText12= findViewById(R.id.editText12);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "chut dede", Toast.LENGTH_SHORT).show();
//                String s = editText12.getText().toString();
//                int meter = Integer.parseInt(s);
//                double centimeter = 100 * meter;
//                textView3.setText("value is" + centimeter + "cm" );

//
//
//
//            }
//        });
//
//
//
//
//
//
    }public void calculate(View view){
        String s = editText12.getText().toString();
        int meter = Integer.parseInt(s);
        double centimeter = 100 * meter;
        textView3.setText("value is" + centimeter + "cm" );
    }
}