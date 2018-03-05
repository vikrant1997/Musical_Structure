package com.vikrant.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Vikrant on 10-02-2018.
 */

public class PlayMusicActivity extends AppCompatActivity {
    private ImageView stopView, pauseView, playView;
    int stopflag = 0, pauseflag = 0, playflag = 0;
    private Button playlistsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_music_activity);
        stopView = findViewById(R.id.stop);
        playView = findViewById(R.id.play);
        pauseView = findViewById(R.id.pause);
        playlistsButton = findViewById(R.id.playlist_button);


        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playflag == 0) {
                    playView.setImageResource(R.drawable.pause);
                    playflag = 1;
                } else if (playflag == 1) {
                    playView.setImageResource(R.drawable.play);
                    playflag = 0;
                }
            }
        });
        stopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stopflag == 0) {
                    stopView.setImageResource(R.drawable.play);
                    stopflag = 1;
                } else if (stopflag == 1) {
                    stopView.setImageResource(R.drawable.stop);
                    stopflag = 0;
                }
            }
        });

        pauseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pauseflag == 0) {
                    pauseView.setImageResource(R.drawable.stop);
                    pauseflag = 1;
                } else if (pauseflag == 1) {
                    pauseView.setImageResource(R.drawable.pause);
                    pauseflag = 0;
                }
            }
        });

        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(getApplicationContext(), PlaylistsAcitivity.class);
                startActivity(newIntent);
            }
        });

    }
}
