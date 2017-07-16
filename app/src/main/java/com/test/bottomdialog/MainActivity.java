package com.test.bottomdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private BottomDialog bottomDialog;
    private Button mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                    showBottomDialog();
                break;
        }
    }

    /**
     * 展示
     */
    private void showBottomDialog() {
        bottomDialog = new BottomDialog(this);
        bottomDialog.setClicklistener(new BottomDialog.ClickListenerInterface() {
            @Override
            public void onTitleClick() {

            }

            @Override
            public void onOneClick() {
                mTextView.setText(bottomDialog.getOneTv().getText().toString());
            }

            @Override
            public void onTwoClick() {
                mTextView.setText(bottomDialog.getTwoTv().getText().toString());
            }
        });
    }
}
