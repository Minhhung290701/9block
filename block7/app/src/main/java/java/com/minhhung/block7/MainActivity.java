package java.com.minhhung.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);

        possibilities = (NumberPicker) findViewById(R.id.picked);
        String [] possibilitiesString = {
          "Android",
          "CheckList",
          "Coursera",
          "CoursesUET"
        };
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length-1);
    }

    public void navigate(View v) {
        int choice = possibilities.getValue();
        switch (choice) {
            case 0 :
                webView.loadUrl("https://developer.android.com/");
                break;
            case 1:
                webView.loadUrl("file:///android_asset/checklist.html");
                break;
            case 2:
                webView.loadUrl("https://www.coursera.org/");
                break;
            default:
                webView.loadUrl("https://courses.uet.vnu.edu.vn/");
        }

    }
}