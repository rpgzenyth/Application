package com.example.znyth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_popup);
    }

    public void close(View view) {
        Intent close = new Intent(MenuPopupActivity.this, BottomNavActivity.class);

        startActivity(close);
    }


    public void dice(View view) {
    }

    public void blackBoard(View view) {
    }

    public void objectBank(View view) {
    }

    public void bestiary(View view) {
    }
}