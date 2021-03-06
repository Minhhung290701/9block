package java.com.minhhung.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoMusic = MediaPlayer.create(this,R.raw.piano);
        Switch switch_looping = (Switch) findViewById(R.id.looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                pianoMusic.setLooping(b);
            }
        });
    }




    public void playMusic(View v) {
        if(pianoMusic.isPlaying()) {
            pianoMusic.pause();
        }
        else {
            pianoMusic.start();
        }
    }

    public void pauseMusic(View v) {
        if(pianoMusic.isPlaying()){
            pianoMusic.pause();
        }
    }
}