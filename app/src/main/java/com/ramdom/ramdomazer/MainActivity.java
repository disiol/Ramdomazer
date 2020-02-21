package com.ramdom.ramdomazer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText maxRandomNumber;
    TextView ramdomTextView;
    Button start;
    private Random random = new Random();
    private String maxRandomNumberText;
    private int randomNumber;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maxRandomNumber = findViewById(R.id.max_random_number_editText);
        ramdomTextView = findViewById(R.id.ramdom_textView);
        start = findViewById(R.id.start_button);

        maxRandomNumber.requestFocus();

        start.setOnClickListener(v ->{
            maxRandomNumberText = maxRandomNumber.getText().toString();
            if (!maxRandomNumberText.isEmpty()) {
                randomNumber = random.nextInt(Integer.parseInt(maxRandomNumberText));
                ramdomTextView.setText(getResources().getString(R.string.random_number) +" "+ randomNumber);
            }


        });


    }
}
