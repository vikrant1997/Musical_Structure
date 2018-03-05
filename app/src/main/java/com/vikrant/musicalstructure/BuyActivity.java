package com.vikrant.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Vikrant on 10-02-2018.
 */

public class BuyActivity extends AppCompatActivity {
    private Button nowPlayingButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_activity);
        nowPlayingButton = findViewById(R.id.now_play_music_button);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(getApplicationContext(), PlayMusicActivity.class);
                startActivity(newIntent);
            }
        });
    }
}
