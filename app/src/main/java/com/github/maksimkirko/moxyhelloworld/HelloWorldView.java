package com.github.maksimkirko.moxyhelloworld;

import com.arellomobile.mvp.MvpView;

public interface HelloWorldView extends MvpView {

    void showMessage(int message);
}