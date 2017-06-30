package com.eeepay.cn.demo.schemeproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ChooseActivity extends AppCompatActivity {
    private static final String TAG = ChooseActivity.class.getSimpleName();
    public static final String HOME = "/home";
    public static final String INFOMATION = "infomation";
    public static final String URI = "uri";
    Uri data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        getUriData();
    }

    private void getUriData() {
        data = getIntent().getData();
        Log.d(TAG, "getScheme: "+ data.getScheme());// scheme部分
        Log.d(TAG, "getHost: "+ data.getHost());// host部分
        Log.d(TAG, "getPath: "+ data.getPath());// 访问路劲
        Log.d(TAG, "getQuery: "+ data.getQuery());// Query部分
        Log.d(TAG, "getQueryParameter: "+ data.getQueryParameter("key"));//获取指定参数值
        controlActivity(data.getPath(), data);
    }
    /**
     * 根据Path确定开启哪个Activity
     * @param path
     * @param uri
     */
    private void controlActivity(String path, Uri uri) {
        if(path.equals(HOME))
        {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra(INFOMATION, uri.getQueryParameter(INFOMATION));
            intent.putExtra(URI, uri);
            startActivity(intent);
            finish();
        }
    }
}
