package com.example.even_odd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private Button checkButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.view2);
        checkButton = findViewById(R.id.button);
        resultText = findViewById(R.id.result);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input number from the EditText
                String input = inputNumber.getText().toString().trim();

                if (!input.isEmpty()) {
                    try {
                        int number = Integer.parseInt(input);

                        if (number % 2 == 0) {
                            resultText.setText(number + " is EVEN");
                        } else {
                            resultText.setText(number + " is ODD");
                        }
                    } catch (NumberFormatException e) {
                        resultText.setText("Invalid input. Please enter a valid number.");
                    }
                } else {
                    resultText.setText("Please enter a number.");
                }
            }
        });

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }
}