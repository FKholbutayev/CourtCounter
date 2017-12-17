package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsTeamA = 0;
    int pointsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(pointsTeamA);
    }

    public void threePointsButtonA(View view) {
        pointsTeamA=pointsTeamA+3;
        displayTeamA(pointsTeamA);
    }

    public void threePointsButtonB(View view) {
        pointsTeamB=pointsTeamB+3;
        displayTeamB(pointsTeamB);
    }

    public void twoPointsButtonA(View view) {
        pointsTeamA=pointsTeamA+2;
        displayTeamA(pointsTeamA);
    }

    public void twoPointsButtonB(View view) {
        pointsTeamB=pointsTeamB+2;
        displayTeamB(pointsTeamB);
    }

    public void freeThroughA(View view) {
        pointsTeamA++;
        displayTeamA(pointsTeamA);
    }

    public void freeThroughB(View view) {
        pointsTeamB++;
        displayTeamB(pointsTeamB);
    }

    public void resetButton(View view) {
        pointsTeamA=0;
        pointsTeamB=0;
        displayTeamB(pointsTeamB);
        displayTeamA(pointsTeamA);
    }


    private void displayTeamA(int score) {
        TextView TeamAPoints = (TextView)findViewById(R.id.team_a_score);
        TeamAPoints.setText(String.valueOf(score));

    }

    private void displayTeamB(int score) {
        TextView TeamAPoints = (TextView)findViewById(R.id.team_b_score);
        TeamAPoints.setText(String.valueOf(score));

    }
}
