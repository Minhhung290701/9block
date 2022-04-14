package java.com.minhhung.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View v) {
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();
        Intent gotoSecond =  new Intent();
        gotoSecond.setClass(this,SecondActivity.class);
        gotoSecond.putExtra("nbStars", rating);
        // start the second activity
        startActivity(gotoSecond);
        // remove this current activity
        finish();
    }
}