package com.eeepay.cn.demo.schemeproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
 /**
  * 描述：页面的访问
  * 作者：zhuangzeqin
  * 时间: 2017/6/30-15:28
  * 邮箱：zzq@eeepay.cn
  */
public class WebviewActivity extends AppCompatActivity {
    private WebView webview;
    private final String ASSETSPATH = "file:///android_asset/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        this.webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl(ASSETSPATH+"index.html");
    }
}
