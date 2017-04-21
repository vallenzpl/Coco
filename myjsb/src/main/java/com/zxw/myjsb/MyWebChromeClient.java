package com.zxw.myjsb;

import android.util.Log;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by xiangwuzhu on 16/12/2.
 */

public class MyWebChromeClient extends WebChromeClient{

    private final String TAG = "MyWebChromeClient";

    public MyWebChromeClient() {
        super();
    }

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        Log.e(TAG, "onJsPrompt:"+url);
        return super.onJsPrompt(view, url, message, defaultValue, result);
    }

    @Override
    public void onPermissionRequest(PermissionRequest request) {
        super.onPermissionRequest(request);
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        return super.onJsConfirm(view, url, message, result);
    }

}
