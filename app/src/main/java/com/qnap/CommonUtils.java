package com.qnap;

import android.text.TextUtils;

/**
 * Created by nikhil1804 on 01-05-2017.
 */

public class CommonUtils {

    public static boolean isPasswordValid(CharSequence password) {
        return TextUtils.isEmpty(password);
    }
}
