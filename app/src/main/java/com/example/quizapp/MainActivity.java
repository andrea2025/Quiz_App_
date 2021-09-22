package com.example.quizapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButtonFive;
    RadioButton radioButtonSeven;
    EditText answerAlphabet;
    EditText answerPlanet;
    CheckBox checkBoxRed;
    CheckBox checkBoxGreen;
    CheckBox checkBoxYellow;
    CheckBox checkBoxBlue;
    RadioGroup groupAnimal;
    RadioButton radioButtonElephant;
    RadioButton radioButtonGiffare;
    int correctAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup1);
        groupAnimal = findViewById(R.id.radioGroup);
        radioButtonFive = findViewById(R.id.answerFive);
        radioButtonSeven = findViewById(R.id.answerSeven);
        answerAlphabet = findViewById(R.id.alphabetAnswer);
        answerPlanet = findViewById(R.id.answerPlanet);
        checkBoxBlue = findViewById(R.id.blue);
        checkBoxGreen = findViewById(R.id.green);
        checkBoxRed = findViewById(R.id.red);
        radioButtonElephant = findViewById(R.id.answerElephant);
        radioButtonGiffare = findViewById(R.id.answerGirraffe);
        checkBoxYellow = findViewById(R.id.yellow);

    }


    public void submit(View view) {
        int btnSeven = radioGroup.getCheckedRadioButtonId();
        int btnGiraffe = groupAnimal.getCheckedRadioButtonId();

        boolean checkYellow = checkBoxYellow.isChecked();
        boolean checkRed = checkBoxRed.isChecked();
        boolean checkBlue = checkBoxBlue.isChecked();
        boolean checkGreen = checkBoxGreen.isChecked();


        if (btnSeven == R.id.answerSeven) {
            correctAnswer = correctAnswer + 1;
        }

        Editable editable = answerAlphabet.getText();
        String alphabet = editable.toString();
        if (alphabet.equals("26")) {
            correctAnswer = correctAnswer + 1;
        }

        Editable editablePlanet = answerPlanet.getText();
        String planet = editablePlanet.toString();
        if (planet.equals("9")) {
            correctAnswer = correctAnswer + 1;
        }
        if (btnGiraffe == R.id.answerGirraffe) {
            correctAnswer = correctAnswer + 1;
        }

        if (checkYellow && checkBlue && checkRed && !checkGreen) {
            correctAnswer = correctAnswer + 1;
        } else {

        }
        resultScore(correctAnswer);
        Log.i(TAG, String.valueOf(correctAnswer));
    }

    private void resultScore(int correctScore) {
        Toast.makeText(this, "You got " + correctScore + " points", Toast.LENGTH_LONG)
                .show();
    }

}