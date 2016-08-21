package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Add a string arrayList to store the english translation of numbers.
        ArrayList<String> words = new ArrayList<String>();

        //Initialize the arrayList with numbers.
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        //Find the nuberActivity layout by id.
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //create a variable to keep track of indices.


        //Add child views to LinearLayout till the arraylist is over.
        for (int i = 0; i < words.size(); i++ ) {

            //Create a new TextView.
            TextView wordView = new TextView(this);

            //Set the textView to the current word in the arrylist.
            wordView.setText(words.get(i));

            //add the textview as a child to the rootview.
            rootView.addView(wordView);




        }




    }
}
