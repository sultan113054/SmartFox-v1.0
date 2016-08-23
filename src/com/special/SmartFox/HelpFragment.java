package com.special.SmartFox;

import com.special.SmartFox.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.net.Uri;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;


public class HelpFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    	View rootView = inflater.inflate(R.layout.help, container, false);
        final WebView webView = (WebView)rootView.findViewById(R.id.webView);

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

        return rootView;
    }

}