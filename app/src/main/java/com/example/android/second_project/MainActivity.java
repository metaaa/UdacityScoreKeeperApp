package com.example.android.second_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.android.second_project.R.id.reset;
import static com.example.android.second_project.R.id.team_a_score;
import static com.example.android.second_project.R.id.team_b_score;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    int sotsTeamA = 0;
    int sotsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    int yellowsTeamA = 0;
    int yellowsTeamB = 0;
    int redsTeamA = 0;
    int redsTeamB = 0;
    int cornersTeamA = 0;
    int cornersTeamB = 0;


    //reset_name_team_A
    public void resetnameA(){
        EditText nameA = (EditText) findViewById(R.id.nameA);
        nameA.setText("Name of Team A");
    }

    //reset_name_team_B
    public void resetnameB(){
        EditText nameB = (EditText) findViewById(R.id.nameB);
        nameB.setText("Name of Team B");
    }

     //Displays the score for Team A and B.

    public void scoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void goalA (View view){
        scoreTeamA = scoreTeamA + 1;
        scoreTeamA(scoreTeamA);
    }
    public void goalB (View view){
        scoreTeamB = scoreTeamB + 1;
        scoreTeamB(scoreTeamB);
    }

    //displays the # of shots for team a and b
    //teamA
    public void decrementShotsA(View view) {
        if (shotsTeamA == 0){
            return;
        }
        shotsTeamA = shotsTeamA - 1;
        shotsA_pnt(shotsTeamA);
    }

    public void incrementShotsA(View view) {
        shotsTeamA = shotsTeamA + 1;
        shotsA_pnt(shotsTeamA);
    }

    public void shotsA_pnt(int point){
        TextView shotA_pnt = (TextView) findViewById(R.id.shotA);
        shotA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementShotsB(View view) {
        if (shotsTeamB == 0){
            return;
        }
        shotsTeamB = shotsTeamB - 1;
        shotsB_pnt(shotsTeamB);
    }

    public void incrementShotsB(View view) {
        shotsTeamB = shotsTeamB + 1;
        shotsB_pnt(shotsTeamB);
    }

    public void shotsB_pnt(int point){
        TextView shotB_pnt = (TextView) findViewById(R.id.shotB);
        shotB_pnt.setText(String.valueOf(point));
    }

    //displays the # of shots on target for team a and b
    //teamA
    public void decrementSotsA(View view) {
        if (sotsTeamA == 0){
            return;
        }
        sotsTeamA = sotsTeamA - 1;
        sotsA_pnt(sotsTeamA);
    }

    public void incrementSotsA(View view) {
        sotsTeamA = sotsTeamA + 1;
        sotsA_pnt(sotsTeamA);
    }

    public void sotsA_pnt(int point){
        TextView sotA_pnt = (TextView) findViewById(R.id.sotA);
        sotA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementSotsB(View view) {
        if (sotsTeamB == 0){
            return;
        }
        sotsTeamB = sotsTeamB - 1;
        sotsB_pnt(sotsTeamB);
    }

    public void incrementSotsB(View view) {
        sotsTeamB = sotsTeamB + 1;
        sotsB_pnt(sotsTeamB);
    }

    public void sotsB_pnt(int point){
        TextView sotB_pnt = (TextView) findViewById(R.id.sotB);
        sotB_pnt.setText(String.valueOf(point));
    }

    //displays the # of fouls for team a and b
    //teamA
    public void decrementFoulsA(View view) {
        if (foulsTeamA == 0){
            return;
        }
        foulsTeamA = foulsTeamA - 1;
        foulsA_pnt(foulsTeamA);
    }

    public void incrementFoulsA(View view) {
        foulsTeamA = foulsTeamA + 1;
        foulsA_pnt(foulsTeamA);
    }

    public void foulsA_pnt(int point){
        TextView foulsA_pnt = (TextView) findViewById(R.id.foulA);
        foulsA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementFoulsB(View view) {
        if (foulsTeamB == 0){
            return;
        }
        foulsTeamB = foulsTeamB - 1;
        foulsB_pnt(foulsTeamB);
    }

    public void incrementFoulsB(View view) {
        foulsTeamB = foulsTeamB + 1;
        foulsB_pnt(foulsTeamB);
    }

    public void foulsB_pnt(int point){
        TextView foulsB_pnt = (TextView) findViewById(R.id.foulB);
        foulsB_pnt.setText(String.valueOf(point));
    }

    //displays the # of yellow cards for team a and b
    //teamA
    public void decrementYellowsA(View view) {
        if (yellowsTeamA == 0){
            return;
        }
        yellowsTeamA = yellowsTeamA - 1;
        yellowsA_pnt(yellowsTeamA);
    }

    public void incrementYellowsA(View view) {
        yellowsTeamA = yellowsTeamA + 1;
        yellowsA_pnt(yellowsTeamA);
    }

    public void yellowsA_pnt(int point){
        TextView yellowsA_pnt = (TextView) findViewById(R.id.YA);
        yellowsA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementYellowsB(View view) {
        if (yellowsTeamB == 0){
            return;
        }
        yellowsTeamB = yellowsTeamB - 1;
        yellowsB_pnt(yellowsTeamB);
    }

    public void incrementYellowsB(View view) {
        yellowsTeamB = yellowsTeamB + 1;
        yellowsB_pnt(yellowsTeamB);
    }

    public void yellowsB_pnt(int point){
        TextView yellowsB_pnt = (TextView) findViewById(R.id.YB);
        yellowsB_pnt.setText(String.valueOf(point));
    }

    //displays the # of red cards for team a and b
    //teamA
    public void decrementRedsA(View view) {
        if (redsTeamA == 0){
            return;
        }
        redsTeamA = redsTeamA - 1;
        redsA_pnt(redsTeamA);
    }

    public void incrementRedsA(View view) {
        redsTeamA = redsTeamA + 1;
        redsA_pnt(redsTeamA);
    }

    public void redsA_pnt(int point){
        TextView redsA_pnt = (TextView) findViewById(R.id.RA);
        redsA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementRedsB(View view) {
        if (redsTeamB == 0){
            return;
        }
        redsTeamB = redsTeamB - 1;
        redsB_pnt(redsTeamB);
    }

    public void incrementRedsB(View view) {
        redsTeamB = redsTeamB + 1;
        redsB_pnt(redsTeamB);
    }

    public void redsB_pnt(int point){
        TextView redsB_pnt = (TextView) findViewById(R.id.RB);
        redsB_pnt.setText(String.valueOf(point));
    }

    //displays the # of corner cards for team a and b
    //teamA
    public void decrementCornersA(View view) {
        if (cornersTeamA == 0){
            return;
        }
        cornersTeamA = cornersTeamA - 1;
        cornersA_pnt(cornersTeamA);
    }

    public void incrementCornersA(View view) {
        cornersTeamA = cornersTeamA + 1;
        cornersA_pnt(cornersTeamA);
    }

    public void cornersA_pnt(int point){
        TextView cornersA_pnt = (TextView) findViewById(R.id.corA);
        cornersA_pnt.setText(String.valueOf(point));
    }
    //teamB
    public void decrementCornersB(View view) {
        if (cornersTeamB == 0){
            return;
        }
        cornersTeamB = cornersTeamB - 1;
        cornersB_pnt(cornersTeamB);
    }

    public void incrementCornersB(View view) {
        cornersTeamB = cornersTeamB + 1;
        cornersB_pnt(cornersTeamB);
    }

    public void cornersB_pnt(int point){
        TextView cornersB_pnt = (TextView) findViewById(R.id.corB);
        cornersB_pnt.setText(String.valueOf(point));
    }

    //toasts for explanation
    public void shotsIB(){
        Toast toast = Toast.makeText(this, "Shots", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }
    public void shotsOnTargetIB(){
        Toast toast = Toast.makeText(this, "Shots On Target", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }
    public void foulsIB(){
        Toast toast = Toast.makeText(this, "Fouls", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }
    public void yellowCardsIB(){
        Toast toast = Toast.makeText(this, "Yellow Cards", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }
    public void redCardsIB(){
        Toast toast = Toast.makeText(this, "Red Cards", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }
    public void cornersIB(){
        Toast toast = Toast.makeText(this, "Cornerss", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }


    //resets everything
    public void reset(int score) {
        TextView scoreView = (TextView) findViewById(reset);
        scoreView.setText(String.valueOf(score));
    }
    public void reset_both (View view){
        resetnameA();
        resetnameB();
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        sotsTeamA = 0;
        sotsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        yellowsTeamA = 0;
        yellowsTeamB = 0;
        redsTeamA = 0;
        redsTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        scoreTeamA(scoreTeamA);
        scoreTeamB(scoreTeamB);
        shotsA_pnt(shotsTeamA);
        shotsB_pnt(shotsTeamB);
        sotsA_pnt(sotsTeamA);
        sotsB_pnt(sotsTeamB);
        foulsA_pnt(foulsTeamA);
        foulsB_pnt(foulsTeamB);
        yellowsA_pnt(yellowsTeamA);
        yellowsB_pnt(yellowsTeamB);
        redsA_pnt(redsTeamA);
        redsB_pnt(redsTeamB);
        cornersA_pnt(cornersTeamA);
        cornersB_pnt(cornersTeamB);

    }
}
