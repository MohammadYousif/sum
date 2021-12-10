package com.inducesmile.addlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Addition extends AppCompatActivity {
    EditText num1, num2;
    Button add;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        num1 = findViewById(R.id.num1Id);
        num2 = findViewById(R.id.num2Id);
        add = findViewById(R.id.addId);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(num1.getText().toString());
                int value2 = Integer.parseInt(num2.getText().toString());
                int sum = value1 + value2;
                additionLibrary.add(getApplication() , sum);
                finish();
            }
        });
    }
}