package com.digicon_valley.app_b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_on(View view) {

        Intent intent = new Intent("com.digicon_valley.App_a.main3activity");

        Intent chooser = Intent.createChooser(intent, "Choose an Application");

        startActivity(chooser);
    }
}
