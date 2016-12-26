package com.lab31.admin.Lab3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button bControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bControl = (Button)findViewById(R.id.button1);
    }

    public void onClick1(View v){
        Intent intent = new Intent(Menu.this, Activity2.class);
        startActivity(intent);

    }

    public void onClick2(View v){
        Intent intent = new Intent(Menu.this, Activity3.class);
        startActivity(intent);

    }
    public void onClick3(View v){
        Intent intent = new Intent(Menu.this, Activity4.class);
        startActivity(intent);

    }
    public void onClick4(View v){
        System.exit(0);
    }
}
