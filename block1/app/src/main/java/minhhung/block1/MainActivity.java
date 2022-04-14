package minhhung.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button blueButton, pinkButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blueButton = (Button) findViewById(R.id.button_blue);
        pinkButton = (Button) findViewById(R.id.button_pink);
    }

    public void toDo(View v) {
        if(v.equals(blueButton)){
            v.setVisibility(View.INVISIBLE);
        }
        if(v.equals(pinkButton)) {
            Toast.makeText(getApplicationContext(), "To do", Toast.LENGTH_SHORT).show();
        }
    }
}