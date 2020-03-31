package com.example.gomyevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout,eventbtn;
    private FirebaseAuth.AuthStateListener mAuthstateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        eventbtn=findViewById(R.id.button3);

        btnLogout=findViewById(R.id.logout);


        eventbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToevent= new Intent(HomeActivity.this,
                        PackageActivity.class);
                startActivity(intToevent);

            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain= new Intent(HomeActivity.this,
                        MainActivity.class);
                startActivity(intToMain);
            }
        });
    }
}
