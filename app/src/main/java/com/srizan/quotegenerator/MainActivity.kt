package com.srizan.quotegenerator

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val quotesWebView: WebView = WebView(this)
        quotesWebView.run {
            setContentView(quotesWebView)
            loadUrl("https://srizanx.github.io/01-quote-generator/")
            settings.javaScriptEnabled = true
        }
    }
}