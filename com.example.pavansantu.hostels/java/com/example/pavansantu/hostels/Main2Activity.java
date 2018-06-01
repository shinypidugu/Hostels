/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
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
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.pavansantu.hostels.krm;
import com.example.pavansantu.hostels.kshetra;
import com.example.pavansantu.hostels.nisha;
import com.example.pavansantu.hostels.sai;
import com.example.pavansantu.hostels.vaibav;

public class Main2Activity
extends AppCompatActivity {
    String[] hosteldetails = new String[]{"KRM GIRLS HOSTEL", "kSHETRA BOYS HOSTEL", "VAIBAV GIRLS HOSTEL", "SAI BOYS HOSTEL", "NISHA GIRLS HOSTEL"};

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296287);
        ListView listView = (ListView)this.findViewById(2131165268);
        listView.setAdapter((ListAdapter)new ArrayAdapter((Context)this, 17367043, this.hosteldetails));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                if (n == 0) {
                    Intent intent = new Intent(Main2Activity.this.getApplicationContext(), (Class)krm.class);
                    Main2Activity.this.startActivity(intent);
                }
                if (n == 1) {
                    Intent intent = new Intent(Main2Activity.this.getApplicationContext(), (Class)kshetra.class);
                    Main2Activity.this.startActivity(intent);
                }
                if (n == 2) {
                    Intent intent = new Intent(Main2Activity.this.getApplicationContext(), (Class)vaibav.class);
                    Main2Activity.this.startActivity(intent);
                }
                if (n == 3) {
                    Intent intent = new Intent(Main2Activity.this.getApplicationContext(), (Class)sai.class);
                    Main2Activity.this.startActivity(intent);
                }
                if (n == 4) {
                    Intent intent = new Intent(Main2Activity.this.getApplicationContext(), (Class)nisha.class);
                    Main2Activity.this.startActivity(intent);
                }
            }
        });
    }

}

