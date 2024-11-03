package com.example.entregablelayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Log tag for logging button clicks
    private static final String TAG = "Keypad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find and set up click listeners for each button
        int[] buttonIds = {
                R.id.button_numlock, R.id.button_divide, R.id.button_multiply, R.id.button_minus,
                R.id.button_7, R.id.button_8, R.id.button_9, R.id.button_plus,
                R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_enter,
                R.id.button_1, R.id.button_2, R.id.button_3,
                R.id.button_0, R.id.button_dot
        };

        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Obtener el texto del botón pulsado
                    String buttonText = ((Button) v).getText().toString();
                    // Log informativo
                    Log.i(TAG, "Button pressed: " + buttonText);
                }
            });
        }
    }
}
