package com.example.gautham.imagetotextanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get access to buttons and editTexts
        ImageButton cameraButton = (ImageButton) findViewById(R.id.cameraButton);
        Button submitButton = (Button) findViewById(R.id.submitButton);

        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText phoneText = (EditText) findViewById(R.id.phoneText);
        EditText emailText = (EditText) findViewById(R.id.emailText);

    }
}
