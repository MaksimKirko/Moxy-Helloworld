package com.github.maksimkirko.moxyhelloworld;

import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class HelloWorldActivity extends MvpAppCompatActivity implements HelloWorldView {

    @InjectPresenter
    HelloWorldPresenter mHelloWorldPresenter;

    private TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        mHelloWorldTextView = ((TextView) findViewById(R.id.activity_hello_world_text_view_message));
    }

    @Override
    public void showMessage(int message) {
        mHelloWorldTextView.setText(message);
    }
}