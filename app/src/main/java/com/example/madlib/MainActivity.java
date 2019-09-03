package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v) {
        Intent intent = null;
        try {
// getting a reference to my edit text fields
            EditText myNoun = (EditText) findViewById(R.id.myNoun);
            EditText myAdjective = (EditText) findViewById(R.id.myAdjective);
            EditText myVerb = (EditText) findViewById(R.id.myVerb);
            EditText myAnimal = (EditText) findViewById(R.id.myAnimal);
            EditText myNumber = (EditText) findViewById(R.id.myNumber);
// extracting the text from those edit text fields
            String myNounStr = myNoun.getText().toString();
            String myAdjectivestr = myAdjective.getText().toString();
            String myVerbstr = myVerb.getText().toString();
            String myAnimalstr = myAnimal.getText().toString();
            String myNumberstr = myNumber.getText().toString();
// Creating the intent object so I can send data
            intent = new Intent(this, Story.class);
// putting data from edit text fields into intent to send to other activity
// MY_Name and MY_AGE are public constants in InfoActivity class
            intent.putExtra(Story.MY_NOUN, myNounStr);
            intent.putExtra(Story.MY_ADJECTIVE, myAdjectivestr);
            intent.putExtra(Story.MY_VERB, myVerbstr);
            intent.putExtra(Story.MY_ANIMAL, myAnimalstr);
            intent.putExtra(Story.MY_NUMBER, myNumberstr);
// loads the next activity
            startActivity(intent);
        } catch (Exception e) {
            intent.putExtra(Story.MY_NOUN, "error");
            intent.putExtra(Story.MY_ADJECTIVE, "error");
            intent.putExtra(Story.MY_VERB, "error");
            intent.putExtra(Story.MY_ANIMAL, "error");
            intent.putExtra(Story.MY_NUMBER, "error");
        }
    }
}
