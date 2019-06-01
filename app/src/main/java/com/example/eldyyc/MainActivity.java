package com.example.eldyyc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Load WebView w  ith HTML from Assets folder
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/main.html");
    }}
