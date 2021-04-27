package com.example.znyth;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perso_page);

        addEventListenerBottomNav();
    }

    public void addEventListenerBottomNav(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_masteries:
                        setContentView(R.layout.activity_perso_page);
                        addEventListenerBottomNav();
                        break;
                    case R.id.action_inventory:
                        setContentView(R.layout.activity_onglet2);
                        addEventListenerBottomNav();
                        break;
                    case R.id.action_attacks:
                        setContentView(R.layout.activity_onglet3);
                        addEventListenerBottomNav();
                        break;
                    case R.id.action_others_masteries:
                        setContentView(R.layout.activity_onglet4);
                        addEventListenerBottomNav();
                        break;
                    case R.id.action_Description:
                        setContentView(R.layout.activity_onglet5);
                        addEventListenerBottomNav();
                        break;
                }
                return true;
            }
        });
    }

    public void dialogMenuBurger(View view) {
        Intent menuPage = new Intent(BottomNavActivity.this, MenuPopupActivity.class);

        startActivity(menuPage);
    }


    public void dialogSettings(View view) {
        Intent settings = new Intent(BottomNavActivity.this, SettingsPopupActivity.class);

        startActivity(settings);
    }
}
