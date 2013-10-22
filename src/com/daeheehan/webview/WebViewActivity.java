package com.daeheehan.webview;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class WebViewActivity extends Activity {
	private static final String CNAME = MainActivity.class.getSimpleName();

	private WebView mWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);

		mWebView = (WebView) findViewById(R.id.webView);
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
