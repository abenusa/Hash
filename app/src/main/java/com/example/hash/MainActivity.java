package com.example.hash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Hash hash;
    EditText etxtClearTextIn;
    Button btnMD5Hash;
    EditText etxtMD5Hash;
    Button btnSHA256Hash;
    EditText etxtSHA256Hash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hash = new Hash();

        etxtClearTextIn = (EditText) findViewById(R.id.etxtClearTextIn);
        btnMD5Hash = (Button) findViewById(R.id.btnMD5Hash);
        etxtMD5Hash = (EditText) findViewById(R.id.etxtMD5Hash);
        btnSHA256Hash = (Button) findViewById(R.id.btnSHA256Hash);
        etxtSHA256Hash = (EditText) findViewById(R.id.etxtSHA256Hash);

        btnMD5Hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaintext = etxtClearTextIn.getText().toString();
                String hashValue = hash.MD5Hash(plaintext);
                etxtMD5Hash.setText(hashValue);
            }
        }); // end btnMD5Hash click listener

        btnSHA256Hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaintext = etxtClearTextIn.getText().toString();
                String hashValue = hash.SHA256Hash(plaintext);
                etxtSHA256Hash.setText(hashValue);
            }
        }); // end btnSHA256Hash click listener

    }
}
