package com.snehpandya.viewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//https://medium.com/google-developers/viewmodels-a-simple-example-ed5ac416317e
public class MainActivity extends AppCompatActivity {

    ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);

        displayForTeamA(mViewModel.getScoreTeamA());
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    public void score1A(View v) {
        mViewModel.setScoreTeamA(1);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    public void score1B(View v) {
        mViewModel.setScoreTeamB(1);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    public void score2A(View v) {
        mViewModel.setScoreTeamA(2);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    public void score2B(View v) {
        mViewModel.setScoreTeamB(2);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    public void score3A(View v) {
        mViewModel.setScoreTeamA(3);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    public void score3B(View v) {
        mViewModel.setScoreTeamB(3);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        mViewModel.setAZero();
        mViewModel.setBZero();
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
