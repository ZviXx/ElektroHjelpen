package com.example.flamingo.elektrohjelpen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import java.lang.Math;
import java.text.NumberFormat;

import com.example.flamingo.elektrohjelpen.R;

import static com.example.flamingo.elektrohjelpen.R.id.*;

public class Ampere extends AppCompatActivity {


    EditText ampereVolt;
    EditText ampereWatt;
    EditText ampereOhm;
    TextView ampereSum;
    Button ampereKalkuler;

    double ampereVoltNummer;
    double ampereWattNummer;
    double ampereOhmNummer;
    double sumAmpereWattVolt, sumAmpereVoltOhm, sumAmpereWattOhm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampere);

        ampereKalkuler = (Button) findViewById(R.id.ampereKalkuler);

        final NumberFormat nm = NumberFormat.getNumberInstance();
        

        ampereKalkuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    
                    ampereVolt = (EditText) findViewById(R.id.ampereVolt);
                    ampereWatt = (EditText) findViewById(R.id.ampereWatt);
                    ampereOhm = (EditText) findViewById(R.id.ampereResistans);
                    ampereSum = (TextView) findViewById(R.id.ampereSum);

                    ampereVoltNummer = Double.parseDouble(ampereVolt.getText().toString());
                    ampereWattNummer = Double.parseDouble(ampereWatt.getText().toString());
                    ampereOhmNummer = Double.parseDouble(ampereOhm.getText().toString());



                    if(ampereVolt.getText().toString().trim().length() == 0){

                        sumAmpereWattOhm = Math.sqrt(ampereWattNummer/ampereOhmNummer);

                        ampereSum.setText(nm.format(sumAmpereWattOhm));

                    }




                    }

            });
        };




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    
        getMenuInflater().inflate(R.menu.menu_ampere, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    
        int id = item.getItemId();

        
        if (id == action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
