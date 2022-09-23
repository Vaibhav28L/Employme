package com.cst2335.employme;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //assigning id of toolbar to a variable
        Toolbar toolbar = findViewById(R.id.toolbar);
        //toolbar as a Actionbar
        setSupportActionBar(toolbar);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Home:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Go to Home",
                                Toast.LENGTH_SHORT)
                        .show();
                return true;


            case R.id.Profile:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows your Profile",
                                Toast.LENGTH_SHORT)
                        .show();

                return (true);

            case R.id.My_jobs:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows your jobs status",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.My_reviews:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows your Reviewed jobs",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.Email_settings:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Show your email settings",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.Settings:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows Settings",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.Region_and_language:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows the page to Update your Country and Language",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.help_centre:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Help regarding any issue",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.sign_out:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Sign out from Employme",
                                Toast.LENGTH_SHORT)
                        .show();
                finish();
                return (true);

            case R.id.exit:

                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
