package com.softdesign.devintensive.ui.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.softdesign.devintensive.R;

/**
 * Created by Android on 08.07.2016.
 */
public class AuthActivity extends AppCompatActivity {
    private Button mAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

        mAuth = (Button) findViewById(R.id.auth_enter);
        mAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
