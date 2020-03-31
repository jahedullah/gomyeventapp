package com.example.gomyevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProceedActivity extends AppCompatActivity {
    public Button btnlogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);
        btnlogout=findViewById(R.id.button6);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain= new Intent(ProceedActivity.this,
                        MainActivity.class);
                startActivity(intToMain);

            }
        });
    }
}
