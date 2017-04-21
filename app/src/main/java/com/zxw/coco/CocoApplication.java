package com.zxw.coco;

import android.app.Application;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by xiangwuzhu on 17/3/16.
 */

public class CocoApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        PatchManager patchManager = new PatchManager(this);
        patchManager.init("1.2");
        patchManager.loadPatch();

        try {
            patchManager.addPatch("");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
