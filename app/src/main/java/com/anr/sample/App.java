package com.anr.sample;

import android.app.Application;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                DataDumup.getInstance().setNumber(5);
            }
        });

        t.setName("SampleWriterThread");
        t.start();
    }
}