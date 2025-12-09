package com.airtel.myapplication

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(private val context: Context) {

    @JavascriptInterface
    fun getData(): String {
        // Return whatever data WebView needs
        return "{\"name\":\"Preety\", \"id\":123}"
    }

    @JavascriptInterface
    fun setResult() {


        Toast.makeText(context, "setResult() Called", Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    fun updatePricing(status: String, message: String) {
        // Do something with pricing response
        Toast.makeText(context, "Status: $status \nMessage: $message", Toast.LENGTH_LONG).show()
    }
}
