package com.example.daffa.tes1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText)findViewById(R.id.editTextUsername1);
        final EditText password = (EditText)findViewById(R.id.editTextPassword1);
        final EditText nama = (EditText)findViewById(R.id.editTextNama1);
        Button button = (Button)findViewById(R.id.btnRegister);

        final String name = nama.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);

                i.putExtra("name", nama.getText().toString().trim());
                i.putExtra("usr", username.getText().toString().trim());
                i.putExtra("pass", password.getText().toString().trim());

                Toast.makeText(MainActivity.this, "Anda Sudah Terdaftar ", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });
    }
}
