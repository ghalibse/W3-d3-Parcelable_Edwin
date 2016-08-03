package com.example.parcelablesimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mTextView = (TextView) findViewById(R.id.a_details_number);
        mTextViewStudent = (TextView) findViewById(R.id.a_details_student);

        int number = getIntent().getIntExtra(MainActivity.NUMBER_KEY, -1);

        Student student = getIntent().getParcelableExtra(MainActivity.STUDENT_KEY_PARCEL);

        mTextView.setText(String.valueOf(number));

        mTextViewStudent.setText(student.toString());
    }
}
