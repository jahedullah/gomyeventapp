package com.example.gomyevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class PackageActivity extends AppCompatActivity {
    public Button btnlogout;
    TextView bday,anniversary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);


        btnlogout=findViewById(R.id.button4);
        bday=findViewById(R.id.textView5);
        anniversary=findViewById(R.id.textView6);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain= new Intent(PackageActivity.this,
                        MainActivity.class);
                startActivity(intToMain);
            }
        });
        bday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inToCart= new Intent(PackageActivity.this,
                        CartActivity.class);
                startActivity(inToCart);

            }
        });
        anniversary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inToCart= new Intent(PackageActivity.this,
                        CartActivity.class);
                startActivity(inToCart);

            }
        });

    }
}
