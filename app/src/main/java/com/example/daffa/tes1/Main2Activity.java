package com.example.daffa.tes1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText username = (EditText)findViewById(R.id.editTextUsername);
        final EditText password = (EditText)findViewById(R.id.editTextPassword);
        Button button = (Button)findViewById(R.id.btnLogin);



        Intent a = getIntent();

        final Bundle bundle = a.getExtras();

        final String nama = bundle.getString("name");
        final String pwd = bundle.getString("pass");
        final String usrname = bundle.getString("usr");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("usrname", usrname.trim());
                i.putExtra("pwd", pwd.trim());
                i.putExtra("loginUsr", username.getText().toString().trim());
                i.putExtra("loginPwd", password.getText().toString().trim());

                startActivity(i);
            }
        });
    }
}
