package com.example.tasc4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText sname,spass;
Button button;
String tname,tpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sname=(EditText)findViewById(R.id.name);
        spass=(EditText)findViewById(R.id.pass);
        button=(Button)findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tname=sname.getText().toString().trim();
                tpass=spass.getText().toString().trim();
                if(tname.equals("mgcollege") && tpass.equals("12345"))
                {
                    Intent ob=new Intent(getApplicationContext(),tasc4hom.class);
                    startActivity(ob);
                }
                else
                {
                   Toast.makeText(getApplicationContext(),"INCORRECT USERNAME OR PASSWORD",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
