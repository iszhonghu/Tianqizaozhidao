package com.example.zhonghu.tianqizaozhidao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by zhonghu on 2018/8/28.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
