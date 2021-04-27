package com.example.znyth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

public class HomeActivity extends AppActivity {


    private Button buttonLoad;
    private Timer myTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void newGame(View view) {
        Intent intentNewGame = new Intent(HomeActivity.this, NewGameActivity.class);
        startActivity(intentNewGame);
    }

    public void loadGame(View view) {
        Intent intentLoadGame = new Intent(HomeActivity.this, LoadGameActivity.class);
        startActivity(intentLoadGame);
    }

    public void parameters(View view) {
        Intent intentParameters = new Intent(HomeActivity.this, MainsSQLActivity.class);
        startActivity(intentParameters);
    }

}
