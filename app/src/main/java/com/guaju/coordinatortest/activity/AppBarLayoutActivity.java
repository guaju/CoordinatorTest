package com.guaju.coordinatortest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.guaju.coordinatortest.R;

/**
 * Created by guaju on 2017/11/8.
 */

public class AppBarLayoutActivity extends Activity {

    private TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar);
        initView();
        initData();
    }

    private void initData() {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<50;i++){
           sb.append("今天是第"+(i+1)+"天\n");
        }
        String s = sb.toString();
        tv.setText(s);
    }

    private void initView() {
        tv = findViewById(R.id.tv);
    }
}
