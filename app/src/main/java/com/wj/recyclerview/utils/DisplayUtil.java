package com.wj.recyclerview.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by Hannah on 2018/5/31.
 */

public class DisplayUtil {
  public static int dp2px(Context context, int dp) {
    DisplayMetrics metrics = context.getResources().getDisplayMetrics();
    return (int) (metrics.density * dp + 0.5f);
  }
}
