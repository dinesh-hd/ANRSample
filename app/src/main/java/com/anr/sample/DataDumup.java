package com.anr.sample;

import android.util.Log;

import java.util.concurrent.locks.ReentrantLock;

public class DataDumup {

    private static DataDumup instance = null;
    private final ReentrantLock lock = new ReentrantLock();

    private int number = 1;

    private DataDumup(){

    }


    public static DataDumup getInstance(){
        if(instance != null) return instance;

        instance = new DataDumup();
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public synchronized void setNumber(int i){
        int k = 0;
        while(k < 100) {
            number = i;
            k++;
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
