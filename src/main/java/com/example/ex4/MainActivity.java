package com.example.ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText n1 = findViewById(R.id.editTextNumberSigned3);
        EditText n2 = findViewById(R.id.editTextNumberSigned2);
        TextView textView = findViewById(R.id.textView3);
        Button button = findViewById(R.id.button);

        int v1 = Integer.parseInt(n1.getText().toString());
        int v2 = Integer.parseInt(n2.getText().toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (v1 < 0 || v1 > 50 || v2 < 0 || v2 > 50) {
                    n1.setText("");
                    n2.setText("");
                    textView.setText("Erro os números devem ser entre 0 e 50");
                }
            }
        });

    }
}