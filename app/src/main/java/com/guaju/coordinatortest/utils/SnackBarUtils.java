package com.guaju.coordinatortest.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by guaju on 2017/11/8.
 */

public class SnackBarUtils {
    static Snackbar snackbar;

    public static void showSnack(View parentView,String  msg){
        if(snackbar==null){
            snackbar=Snackbar.make(parentView,"",Snackbar.LENGTH_LONG);
        }
        snackbar.setText(msg);
        snackbar.show();
    }

}
