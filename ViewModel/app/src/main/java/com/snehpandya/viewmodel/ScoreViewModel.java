package com.snehpandya.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class ScoreViewModel extends ViewModel {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamA(int a) {
        scoreTeamA = scoreTeamA + a;
    }

    public void setScoreTeamB(int b) {
        scoreTeamB = scoreTeamB + b;
    }

    public void setAZero() {
        scoreTeamA = 0;
    }

    public void setBZero() {
        scoreTeamB = 0;
    }
}
