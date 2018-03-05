package com.vikrant.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Vikrant on 10-02-2018.
 */

public class PlaylistsAcitivity extends AppCompatActivity {
    private Button playMusicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlists_activity);
        playMusicButton = findViewById(R.id.play_music_button);
        playMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlayMusicActivity.class);
                startActivity(intent);
            }
        });
    }
}
