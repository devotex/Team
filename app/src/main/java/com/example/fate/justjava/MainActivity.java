package com.example.fate.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA=0;
    int scoreteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void reset(View v){
    scoreteamA=0;
    scoreteamB=0;
    displayForTeamA(scoreteamA);
    displayForTeamB(scoreteamB);


}

    public void addthree(View v){
        scoreteamA=scoreteamA+3;
        displayForTeamA(scoreteamA);
    }
    public void addtwoe(View v){
        scoreteamA=scoreteamA+2;
        displayForTeamA(scoreteamA);
}
    public void aclear(View v){
        scoreteamA=scoreteamA+1;
        displayForTeamA(scoreteamA);
    }
    public void baddthree(View v){
        scoreteamB=scoreteamB+3;
        displayForTeamB(scoreteamB);
    }
    public void baddtwoe(View v){
        scoreteamB=scoreteamB+2;
        displayForTeamB(scoreteamB);
    }
    public void bclear(View v){
        scoreteamB=scoreteamB+1;
        displayForTeamB(scoreteamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    }

