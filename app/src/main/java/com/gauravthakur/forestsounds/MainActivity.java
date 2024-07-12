package com.gauravthakur.forestsounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playTigerSound(View view) {
        playSound(R.raw.tiger);
    }

    public void playElephantSound(View view) {
        playSound(R.raw.elephant);
    }

    public void playDonkeySound(View view) {
        playSound(R.raw.donkey);
    }

    public void playHorseSound(View view) {
        playSound(R.raw.horse);
    }

    public void playCatSound(View view) {
        playSound(R.raw.cat);
    }

    public void playChickenSound(View view) {
        playSound(R.raw.chicken);
    }

    public void playDogSound(View view) {
        playSound(R.raw.dog);
    }

    public void playGoatSound(View view) {
        playSound(R.raw.goat);
    }

    public void playCowSound(View view) {
        playSound(R.raw.cow);
    }

    private void playSound(int soundResource) {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;
        }
        mediaPlayer = MediaPlayer.create(this, soundResource);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
