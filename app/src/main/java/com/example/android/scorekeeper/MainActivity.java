package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team A (Springboks).
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.score_a_team);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B (All Blacks).
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.score_b_team);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addOneTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the game scores
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Displays the given fouls for Team A (Springboks).
     */
    public void displayFoulsTeamA(int foul) {
        TextView foulView = findViewById(R.id.fouls_a_committed);
        foulView.setText(String.valueOf(foul));
    }

    public void addFoulTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    public void displayFoulsTeamB(int foul) {
        TextView foulView = findViewById(R.id.fouls_b_committed);
        foulView.setText(String.valueOf(foul));
    }

    public void addFoulTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

}
