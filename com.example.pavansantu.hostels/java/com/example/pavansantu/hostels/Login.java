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
 *  android.widget.Button
 *  java.lang.Class
 *  java.lang.Object
 */
package com.example.pavansantu.hostels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.pavansantu.hostels.MainActivity;

public class Login
extends AppCompatActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296285);
        ((Button)this.findViewById(2131165267)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(Login.this.getApplicationContext(), (Class)MainActivity.class);
                Login.this.startActivity(intent);
            }
        });
    }

}

