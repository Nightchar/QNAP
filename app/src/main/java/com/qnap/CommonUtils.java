package com.qnap;

import android.text.TextUtils;

/**
 * Created by nikhil1804 on 01-05-2017.
 */

public class CommonUtils {

    /**
     * Check if password is valid or not.
     *
     * @param password the password string
     * @return return if password valid
     */
    public static boolean isPasswordValid(CharSequence password) {
        return TextUtils.isEmpty(password);
    }
}
