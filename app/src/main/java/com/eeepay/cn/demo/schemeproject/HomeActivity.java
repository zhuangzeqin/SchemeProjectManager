package com.eeepay.cn.demo.schemeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static com.eeepay.cn.demo.schemeproject.ChooseActivity.INFOMATION;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String stringExtra = getIntent().getStringExtra(INFOMATION);
        Toast.makeText(this, stringExtra, Toast.LENGTH_SHORT).show();
    }
}
