package ru.intefor.browser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebClient extends WebViewClient{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
