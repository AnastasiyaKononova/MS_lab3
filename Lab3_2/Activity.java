package com.lab31.admin.lab3_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
    }

    public void onClick(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ru.pinterest.com/pin/485333297326554349/"));
        startActivity(browserIntent);

    }
}
