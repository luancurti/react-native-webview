package com.reactnativecommunity.wkwebview;

import android.webkit.WebView;

/**
 * Implement this interface in order to config your {@link WebView}. An instance of that
 * implementation will have to be given as a constructor argument to {@link RNCWKWebViewManager}.
 */
public interface WebViewConfig {

  void configWebView(WebView webView);
}
