/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.example.pavansantu.hostels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.example.pavansantu.hostels.Main2Activity;

public class MainActivity
extends AppCompatActivity {
    String[] banglore = new String[]{"Indiranagar", "Hebbal", "Malleswaram", "Magestic"};
    String[] chennai = new String[]{"Adyar", "chetput", "ICF", "Koyambedu"};
    String[] city = new String[]{"Hyderabad", "Vizag", "Chennai", "Banglore"};
    String[] hyderabad = new String[]{"Ameerpet", "S.R nagar", "Kukatpally", "Madhapur"};
    String[] vizag = new String[]{"Jagadhamba", "M.V.P", "Beachroad", "Gajuwaka"};

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296286);
        Button button = (Button)this.findViewById(2131165230);
        Spinner spinner = (Spinner)this.findViewById(2131165226);
        final Spinner spinner2 = (Spinner)this.findViewById(2131165213);
        spinner.setAdapter((SpinnerAdapter)new ArrayAdapter((Context)this, 17367043, this.city));
        final ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367043, this.hyderabad);
        final ArrayAdapter arrayAdapter2 = new ArrayAdapter((Context)this, 17367043, this.vizag);
        final ArrayAdapter arrayAdapter3 = new ArrayAdapter((Context)this, 17367043, this.chennai);
        final ArrayAdapter arrayAdapter4 = new ArrayAdapter((Context)this, 17367043, this.banglore);
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener(){

            public void onItemSelected(AdapterView<?> adapterView, View view, int n, long l) {
                if (n == 0) {
                    spinner2.setAdapter((SpinnerAdapter)arrayAdapter);
                }
                if (n == 1) {
                    spinner2.setAdapter((SpinnerAdapter)arrayAdapter2);
                }
                if (n == 2) {
                    spinner2.setAdapter((SpinnerAdapter)arrayAdapter3);
                }
                if (n == 3) {
                    spinner2.setAdapter((SpinnerAdapter)arrayAdapter4);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        spinner.setOnItemSelectedListener(onItemSelectedListener);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this.getApplicationContext(), (Class)Main2Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}

