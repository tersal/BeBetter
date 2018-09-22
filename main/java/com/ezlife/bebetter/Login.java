package com.ezlife.bebetter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btRegister = (Button) findViewById(R.id.Register);
        btRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CallServices();
            }
        });
    }

    protected void CallServices(){

    }
}
