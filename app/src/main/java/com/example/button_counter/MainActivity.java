package com.example.button_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView value;
    Button btncount;
int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value.findViewById(R.id.txt_val);
        btncount.findViewById(R.id.btn_val);
         count=0;
        value.setText(String.valueOf(count));
        final int[] currentcount = {Integer.parseInt(value.getText().toString())};
        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(String.valueOf(currentcount[0] +1));
                currentcount[0]++;
            }
        });

    }
}
