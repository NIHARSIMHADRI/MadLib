package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Story extends AppCompatActivity {

    public static final String MY_NOUN = "noun";
    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_VERB = "verb";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myAdjective = intent.getStringExtra(MY_ADJECTIVE);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myNumber = intent.getStringExtra(MY_NUMBER);
        String strToDisplay = "In a jungle there was a huge " + myNoun + ". The " + myNoun + " liked to "
                + myVerb + " every day and was hated by everyone else. One day he found a " +
                myAdjective + " apple and decided to share it with a " + myAnimal + ". Due to his generosity he was rewarded with " + myNumber + " dollars.";
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }
}
