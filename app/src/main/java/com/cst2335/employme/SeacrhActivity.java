package com.cst2335.employme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SeacrhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        //assigning id of toolbar to a variable
        Toolbar toolbar = findViewById(R.id.toolbar);
        //toolbar as a Actionbar
        setSupportActionBar(toolbar);

        //Assigning id of search button to a variable
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(SeacrhActivity.this, ListActivity.class);
                startActivity(itn);
            }
        });
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

    public static class GetResponse extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search);


            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://indeed-indeed.p.rapidapi.com/apisearch?publisher=Vaibhav&v=2&format=json&callback=return&q=java&l=austin%2C%20tx&sort=relevance&radius=25&st=jobsite&jt=%22fulltime%22%2C%20%22parttime%22%2C%20%22contract%22%2C%20%22internship%22%2C%20%22temporary%22&start=0&limit=10&fromage=2&highlight=0&filter=1&latlong=0&co=Canada&chnl=jobs&userip=0&useragent=0")
                    .get()
                    .addHeader("X-RapidAPI-Key", "9dd6606b17mshcebc24880aff96bp13cfcejsna5c859cd45fc")
                    .addHeader("X-RapidAPI-Host", "indeed-indeed.p.rapidapi.com")
                    .build();

            Response response;

            {
                try {
                    response = client.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

