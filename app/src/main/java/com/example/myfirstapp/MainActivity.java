package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare your views as class variables
    TextView tvTitle;
    EditText etName;
    Button btnGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: Find each view from the XML using its ID
        tvTitle  = findViewById(R.id.tvTitle);
        etName   = findViewById(R.id.etName);
        btnGreet = findViewById(R.id.btnGreet);

        // Step 3: Set a click listener on the button
        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Step 4: Get the name the user typed
                String name = etName.getText().toString();

                // Step 5: Update the title text
                if (name.isEmpty()) {
                    tvTitle.setText("Please enter your name!");
                } else {
                    tvTitle.setText("Hello, " + name + "! 👋");
                }
            }
        });
    }
}