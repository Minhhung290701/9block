package java.com.minhhung.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = getIntent();
        float rating = caller.getFloatExtra("nbStars", 0);
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("Welcome to the second activity! Your rating: " + rating);
    }

    public void returnRating(View v) {
        Intent return_rating = new Intent();
        return_rating.setClass(this, MainActivity.class);
        startActivity(return_rating);
    }


}