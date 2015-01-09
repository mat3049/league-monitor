package com.example.codingslash.leaguemonitorapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

import constant.Region;
import dto.Summoner.Summoner;
import main.java.riotapi.RiotApi;
import main.java.riotapi.RiotApiException;


public class SummonerInfoActivity extends ActionBarActivity {

    // Receive message from intent
    Intent intent = getIntent();
    ProgressDialog progressdialog;

    public void queryRunes(View view) {
        Intent intent = new Intent(this, DummyDisplay.class);
        EditText editText = (EditText) findViewById(R.id.field_summoner_name);
        String summonername = editText.getText().toString();
    }

    // TODO: MAKE EACH FUNCTION ACTUALLY DO SOMETHING
    // TODO: PASS AN ACTUAL DETERMINING VARIABLE TO ASYNCTASK
    // IGNORE ALL SHIT BELOW THIS LINE WIP WIP WIP
//    public void queryMasteries(View view) {
//        Intent intent = new Intent(this, DummyDisplay.class);
//        EditText editText = (EditText) findViewById(R.id.field_summoner_name);
//        String summonername = editText.getText().toString();
//        intent.putExtra(SUMMONER_NAME, summonername);
//        startActivity(intent);
//    }
//
//    public void queryLadder(View view) {
//        Intent intent = new Intent(this, DummyDisplay.class);
//        EditText editText = (EditText) findViewById(R.id.field_summoner_name);
//        String summonername = editText.getText().toString();
//        intent.putExtra(SUMMONER_NAME, summonername);
//        startActivity(intent);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner_info);

        // Receive message from intent
        Intent intent = getIntent();
        String summonername = intent.getStringExtra("SUMMONER_NAME");
        long summonerid = intent.getLongExtra("SUMMONER_ID", 0);

        // Create text view
        TextView textView = new TextView(this);
        textView.setTextSize(20);

        TextView name = (TextView)findViewById(R.id.display_summoner_name);
        TextView id = (TextView)findViewById(R.id.display_summoner_id);

        name.setText("SUMMONER ID: " + summonerid);
        id.setText("SUMMONER NAME: " + summonername);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_summoner_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}