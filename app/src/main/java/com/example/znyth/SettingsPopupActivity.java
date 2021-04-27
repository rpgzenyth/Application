package com.example.znyth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsPopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_popup);
    }

    public void backMenu(View view) {
        Intent backMenu = new Intent(SettingsPopupActivity.this, HomeActivity.class);

        startActivity(backMenu);
    }

    public void tuto(View view) {
    }

    public void saveGame(View view) {
    }

    public void close(View view) {
        Intent close = new Intent(SettingsPopupActivity.this, BottomNavActivity.class);

        startActivity(close);
    }
}