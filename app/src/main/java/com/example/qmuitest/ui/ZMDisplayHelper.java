package com.example.qmuitest.ui;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * @author cginechen
 * @date 2016-03-17
 */
public class ZMDisplayHelper {
    /**
     * 获取 DisplayMetrics
     *
     * @return
     */
    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }
}
