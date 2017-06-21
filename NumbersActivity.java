package com.example.android.trada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Tạo mảng chứa các từ
        ArrayList<String> words = new ArrayList<String>();
        words.add("Một");
        words.add("Hai");
        words.add("Ba");
        words.add("Bốn");
        words.add("Năm");
        words.add("Sáu");
        words.add("Bảy");
        words.add("Tám");
        words.add("Chín");
        words.add("Mười");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index = 0;

        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        index = index + 1;

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index = index + 1;

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);

    }

}
