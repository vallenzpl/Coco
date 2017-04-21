package com.zxw.myjsb;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by xiangwuzhu on 16/12/1.
 */

public class MainJsbActivity extends Activity{

    private WebView webView;
    private String url = "http://h5.dianping.com/platform/dpapp/index.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_jsb_layout);

        webView = (WebView)findViewById(R.id.my_webview);

        webView.setWebChromeClient(new MyWebChromeClient());
        webView.setWebViewClient(new MyWebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(url);
    }


}
