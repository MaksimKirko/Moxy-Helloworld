package com.github.maksimkirko.moxyhelloworld;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class HelloWorldPresenter extends MvpPresenter<HelloWorldView> {

    public HelloWorldPresenter() {
        getViewState().showMessage(R.string.hello_world);
    }
}