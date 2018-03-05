package com.vikrant.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView playlistsTextView, albumsTextView, artistsTextView, playMusicTextView, settingsTextView, buyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playlistsTextView = findViewById(R.id.Playlists);
        albumsTextView = findViewById(R.id.Albums);
        artistsTextView = findViewById(R.id.Artists);
        playMusicTextView = findViewById(R.id.Play_Music);
        settingsTextView = findViewById(R.id.Settings);
        buyTextView = findViewById(R.id.Buy);

        playlistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlists = new Intent(getApplicationContext(), PlaylistsAcitivity.class);
                startActivity(playlists);
            }
        });

        albumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albums = new Intent(getApplicationContext(), AlbumsActivity.class);
                startActivity(albums);
            }
        });
        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artists = new Intent(getApplicationContext(), ArtistsActivity.class);
                startActivity(artists);
            }
        });
        playMusicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playNow = new Intent(getApplicationContext(), PlayMusicActivity.class);
                startActivity(playNow);
            }
        });

        settingsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(settings);
            }
        });
        buyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent purchase = new Intent(getApplicationContext(), BuyActivity.class);
                startActivity(purchase);
            }
        });
    }

}
