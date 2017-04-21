package com.zxw.coco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by xiangwuzhu on 16/11/21.
 */
public class MySubscribe extends AppCompatActivity{


    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };

    Observable observable = Observable.create(new Observable.OnSubscribe() {
        @Override
        public void call(Object o) {



        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }
}
