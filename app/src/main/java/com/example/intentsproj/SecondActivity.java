package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String num1;
    private String num2;
    int n1;
    int n2;
    private Button add;
    private Button mul;
    private Button div;
    private Button sub;
    EditText w1;
    EditText w2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.add);
        mul = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.ded);

        Intent intent = getIntent();
        num1 = intent.getStringExtra("NumOne");
        num2 = intent.getStringExtra("NumTwo");

        TextView l= findViewById(R.id.TInput1);
        TextView m = findViewById(R.id.TInput2);
        final TextView f = findViewById(R.id.Answer);

        l.setText(num1);
        m.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = n1 + n2;
                f.setText(Integer.toString(ans));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = n1*n2;
                f.setText(Integer.toString(ans));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ans = n1/n2;
                f.setText(Double.toString(ans));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = n1-n2;
                f.setText(Integer.toString(ans));
            }
        });

    }
}