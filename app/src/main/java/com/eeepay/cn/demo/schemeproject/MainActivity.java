package com.eeepay.cn.demo.schemeproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 描述：外部开启Activity新姿势
 * //uumobile://mobile/carDetail?car_id=123456，
 * // 其中 scheme 为 uumobile，
 * // host 为 mobile，
 * // relativePath 为 /carDetail，
 * // query 为 car_id=123456。
 * 作者：zhuangzeqin
 * 时间: 2017/6/30-14:21
 * 邮箱：zzq@eeepay.cn
 */
public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
////go://open.app.example/home?infomation="参数值"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button = (Button) findViewById(R.id.button);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //本地返回 && 外部应用的访问是同一个方法
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("go://open.app.example/home?infomation=\"参数值123456\""));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WebviewActivity.class));
            }
        });

    }
}
