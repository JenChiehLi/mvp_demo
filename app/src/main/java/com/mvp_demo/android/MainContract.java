package com.mvp_demo.android;

public interface MainContract {

    interface Presenter {
        void LoadData();
    }

    interface View {
        void onDataLoaded(String s);
    }
}

