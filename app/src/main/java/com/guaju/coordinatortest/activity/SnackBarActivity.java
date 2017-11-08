package com.guaju.coordinatortest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.guaju.coordinatortest.R;
import com.guaju.coordinatortest.utils.SnackBarUtils;

/**
 * Created by guaju on 2017/11/8.
 */

public class SnackBarActivity extends Activity {
    int count=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_coordinator);


    }

    public void click(View v){

        SnackBarUtils.showSnack(findViewById(R.id.fl),"窗前明月光"+count++);
        
    }

}
