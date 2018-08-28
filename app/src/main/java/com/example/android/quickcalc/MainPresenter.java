package com.example.android.quickcalc;

public class MainPresenter implements MainPresenterInterface{

    public MainActivity activity;

    public MainPresenter(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void addNumbers(int number1, int number2) {
        activity.updateResult(number1 + number2);
    }

    @Override
    public void subtractNumbers(int number1, int number2) {
        activity.updateResult(number1 - number2);

    }
}
