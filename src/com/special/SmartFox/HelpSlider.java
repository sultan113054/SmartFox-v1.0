package com.special.SmartFox;

import com.special.SmartFox.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelpSlider extends Activity{
	@SuppressLint("SetJavaScriptEnabled")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        final WebView webView = (WebView)findViewById(R.id.webView);

        webView.setInitialScale(1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
		webView.setWebChromeClient(new WebChromeClient());	
		webView.setWebViewClient(new WebViewClient() {
	    @Override
	    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
	        webView.loadUrl("file:///android_asset/error.html");

	    }
		});
        webView.loadUrl("file:///android_asset/with-jquery.html");

}}
