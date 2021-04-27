package com.example.znyth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoadGameActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_game);
    }

    public void startLoadGame(View view) {
        Intent intentStartLoadGame = new Intent(LoadGameActivity.this, BottomNavActivity.class);
        startActivity(intentStartLoadGame);
    }
}
