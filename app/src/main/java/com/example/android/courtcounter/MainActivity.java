package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 Points button is clicked.
     */
    public void threePointer(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
      /**
     * This method is called when the +2 Points button is clicked
      */

    public void twoPointer(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    /**
     * This method is called when the Free throw button is clicked
     */

    public void freeThrow(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    /**
     * This method is called when the reset button is clicked
     */

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 Points button is clicked.
     */
    public void threePointerB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    /**
     * This method is called when the +2 Points button is clicked
     */

    public void twoPointerB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    /**
     * This method is called when the Free throw button is clicked
     */

    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

 }
