package com.example.wechat_viewpager;

import android.util.Log;

public class L {
    private static final String TAG = "WANG";

    private static boolean sDebug = BuildConfig.DEBUG;

    public static void d(String msg, Object... args){
        if (!sDebug)
            return;
        Log.d(TAG, String.format(msg,args));
    }
}
