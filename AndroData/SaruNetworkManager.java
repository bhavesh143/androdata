package com.beachphotoframe.share;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class SaruNetworkManager {
    public static boolean isInternetConnected(Context context) {
        @SuppressLint("WrongConstant") NetworkInfo netinfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (netinfo == null || !netinfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }
}
