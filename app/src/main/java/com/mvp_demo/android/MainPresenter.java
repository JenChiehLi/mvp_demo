package com.mvp_demo.android;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mView;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void LoadData() {
        String s = "假装我是服务器端获取的数据";
        mView.onDataLoaded(s);
    }
}
