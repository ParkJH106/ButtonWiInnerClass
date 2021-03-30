package kr.ac.smu.smart0356.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button1);
        mTextView1 = (TextView) findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener());
    }
    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            mTextView1.setText("you clicked 박정하의 button!");
        }
    }
}