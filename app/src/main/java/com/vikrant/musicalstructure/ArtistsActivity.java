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

public class ArtistsActivity extends AppCompatActivity {
    private Button artistActivityButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_activity);
        artistActivityButton = findViewById(R.id.playlist_button);
        artistActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlaylistsAcitivity.class);
                startActivity(intent);
            }
        });
    }
}
