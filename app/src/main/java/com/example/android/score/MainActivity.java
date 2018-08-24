package com.example.android.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0, scoreTeamB=0, foulTeamA=0, foulTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForTeamA(View view) {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView= (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));       //another method to display integer into string
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    private void displayForTeamB(int score){
        TextView scoreView= (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayFoulA(foulTeamA);
        displayFoulB(foulTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    private void displayFoulA(int s){
        TextView foulview= (TextView) findViewById(R.id.team_a_foul);
        foulview.setText(String.valueOf(s));
    }

    private void displayFoulB(int s){
        TextView foulview= (TextView) findViewById(R.id.team_b_foul);
        foulview.setText(String.valueOf(s));
    }

    public void foulForTeamA(View view) {
        foulTeamA=foulTeamA+1;
        scoreTeamA=scoreTeamA-1;
        displayFoulA(foulTeamA);
        displayForTeamA(scoreTeamA);
    }

    public void foulForTeamB(View view) {
        foulTeamB=foulTeamB+1;
        scoreTeamB=scoreTeamB-1;
        displayFoulB(foulTeamB);
        displayForTeamB(scoreTeamB);
    }
}
