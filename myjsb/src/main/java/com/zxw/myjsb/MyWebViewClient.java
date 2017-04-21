package com.zxw.myjsb;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by xiangwuzhu on 16/12/2.
 */

public class MyWebViewClient extends WebViewClient{

    private final String TAG = "MyWebViewClient";

    public MyWebViewClient() {
        super();
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return super.shouldInterceptRequest(view, url);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.e(TAG, "shouldOverrideUrlLoading:"+url);
        return super.shouldOverrideUrlLoading(view, url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Log.e(TAG, "onPageStarted:"+url);
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.e(TAG, "onPageFinished:"+url);
        super.onPageFinished(view, url);
    }
}
