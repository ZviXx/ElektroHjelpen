package com.example.flamingo.elektrohjelpen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.flamingo.elektrohjelpen.R;

public class mainOhmsLov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ohms_lov);

        Button voltSideMainKnapp = (Button) findViewById(R.id.voltKnapp);

        voltSideMainKnapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mainOhmsLov.this, Volt.class));
            }
        });

        Button ampereSideMainKnapp = (Button) findViewById(R.id.ampereKnapp);

        ampereSideMainKnapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mainOhmsLov.this, Ampere.class));
            }
        });

        Button ohmSideMainKnapp = (Button) findViewById(R.id.ohmKnapp);

        ohmSideMainKnapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mainOhmsLov.this,Resistans.class));
            }
        });

        Button wattSideMainKnapp = (Button) findViewById(R.id.wattKnapp);

        wattSideMainKnapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mainOhmsLov.this, Watt.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_ohms_lov, menu);
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
