package com.cst2335.employme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning id of toolbar to a variable
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar as a Actionbar
       setSupportActionBar(toolbar);

       //Assigning id of button to a variable
       Button button = findViewById(R.id.login_button);

       //putting onclick listener on login button to access the search page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, SeacrhActivity.class);
             startActivity(intent);
            }


        });
    }
}
