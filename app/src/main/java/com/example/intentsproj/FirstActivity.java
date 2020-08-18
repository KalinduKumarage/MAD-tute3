package com.example.intentsproj;

import   androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button.findViewById(R.id.OK);
        button = findViewById(R.id.OK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSecActivity();
            }
        });

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        View layout;
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

    public void OpenSecActivity()
    {
        EditText e1 = findViewById(R.id.TInput1);
        EditText e2 = findViewById(R.id.TInput2);
        String h = e1.getText().toString();
        String l = e2.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NumOne",h);
        intent.putExtra("NumTwo",l);
        startActivity(intent);
    }

}