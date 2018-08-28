package com.example.android.quickcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityInterface{

    @BindView(R.id.number1)
    EditText number1;

    @BindView(R.id.number2)
    EditText number2;

    @BindView(R.id.plus)
    Button plus;

    @BindView(R.id.minus)
    Button minus;

    @BindView(R.id.result)
    TextView result;

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addNumbers(Integer.valueOf(number1.getText().toString()), Integer.valueOf(number2.getText().toString()));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.subtractNumbers(Integer.valueOf(number1.getText().toString()), Integer.valueOf(number2.getText().toString()));
            }
        });
    }

    @Override
    public void updateResult(int result) {
        this.result.setText(Integer.toString(result));
    }
}
