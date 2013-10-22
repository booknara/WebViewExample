package com.daeheehan.webview;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class WebViewActivity extends RoboActivity {
	private static final String CNAME = MainActivity.class.getSimpleName();

	@InjectView(R.id.webView) private WebView mWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		getActionBar().setDisplayHomeAsUpEnabled(true);
		mWebView.getSettings().setJavaScriptEnabled(true);
		String rUrl = "https://github.com/booknara/WebViewExample";
		mWebView.loadUrl(rUrl);
		
	}
	
	@Override
	public void onBackPressed() {
		if(mWebView.canGoBack())
			mWebView.goBack();
	    else
	        super.onBackPressed();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
			onBackPressed();

	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
}
