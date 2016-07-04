package com.socks.slideselectview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    private SlideSelectView slideSelectView;

    private String[] textStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideSelectView = (SlideSelectView) findViewById(R.id.slideSelectView);
        //		textStrings = new String[]{"汇率 1.1234", "汇率 1.1334", "汇率 1.1434", "汇率 1.1534",
        //				"汇率 1.1734"};
        //		slideSelectView.setString(textStrings);
        slideSelectView.setPercentage(24);
        slideSelectView.setOnSelectListener(new SlideSelectView.onSelectListener() {
            @Override
            public void onSelect(int percentage) {
                Toast.makeText(MainActivity.this, percentage + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
