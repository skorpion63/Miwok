/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows numbers category.
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Find the view that shows Family members.
        TextView family = (TextView) findViewById(R.id.family);

        //Find the view that shows colors.
        TextView colors = (TextView) findViewById(R.id.colors);

        //Find the view that shows phrases.
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Create a onclicklistner to handle the numbers click and open numbersActivity.
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbers);

            }
        });

        //Create a onclicklistner to handle the Family view click and open familyActivity.
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(family);

            }
        });

        //Create a onclicklistner to handle the colors click and open colorActivity.
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colors);

            }
        });

        //Create a onclicklistner to handle the Phrases click and open phrasesActivity.
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrases);


            }
        });


    }


}
