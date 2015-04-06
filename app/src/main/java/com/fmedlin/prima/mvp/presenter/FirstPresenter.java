package com.fmedlin.prima.mvp.presenter;

public class FirstPresenter {

    FirstModel model;
    FirstView view;

    public FirstPresenter(FirstModel model, FirstView view) {
        this.model = model;
        this.view = view;
    }

    public interface FirstModel {
    }

    public interface FirstView {
    }
}
