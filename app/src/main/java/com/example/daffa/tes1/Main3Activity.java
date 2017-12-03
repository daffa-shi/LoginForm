package com.example.daffa.tes1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView masuk = (TextView)findViewById(R.id.textLogin);

        Intent i = getIntent();

        String userReg = i.getStringExtra("usrname");
        String pwdReg = i.getStringExtra("pwd");
        String userLogin = i.getStringExtra("loginUsr");
        String pwdLogin = i.getStringExtra("loginPwd");

        if(Objects.equals(userReg, userLogin)){
            if(Objects.equals(pwdReg, pwdLogin)){
                masuk.setText("LOGIN BERHASIL");
            }
            else if(!Objects.equals(pwdReg, pwdLogin)){
                masuk.setText("PASSWORD SALAH!!");
            }
        }
        else if(!Objects.equals(userReg, userLogin)){
            if(Objects.equals(pwdReg, pwdLogin)){
                masuk.setText("USERNAME SALAH!!");
            }
            else if(!Objects.equals(pwdReg, pwdLogin)){
                masuk.setText("USERNAME DAN PASSWORD SALAH!!");
            }
        }
    }
}
