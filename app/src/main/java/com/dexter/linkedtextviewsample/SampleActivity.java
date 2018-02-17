 package com.dexter.linkedtextviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.dexter.linkedtextviewwithemojicons.ui.LinkedTextView;

public class SampleActivity extends AppCompatActivity {

    LinkedTextView tvText,tvStyleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        tvText = (LinkedTextView) findViewById(R.id.tvText);
        tvStyleText = (LinkedTextView) findViewById(R.id.tvTextStyle);

        tvText.setText("@Developers This is just a sample of our #Awesome+library \uD83D\uDE09\uD83D\uDE80");
        tvStyleText.setText("@Developers This is just a sample of our #Awesome library using styles.xml \uD83D\uDE09\uD83D\uDE80");

        //ClickListener for linkified text
        tvText.setOnLinkClickListener(new LinkedTextView.OnLinkClickListener() {
            @Override
            public void onLinkClick(String link, int start, int end) {
                Toast.makeText(SampleActivity.this, link + "\t" + "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //ClickListener for linkified text
        tvStyleText.setOnLinkClickListener(new LinkedTextView.OnLinkClickListener() {
            @Override
            public void onLinkClick(String link, int start, int end) {
                Toast.makeText(SampleActivity.this, link + "\t" + "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
