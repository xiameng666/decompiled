package com.google.android.gms.common.security;

import android.content.Context;
import android.util.Log;

public class ProviderInstallerImpl {
    static {
    }

    public static void insertProvider(Context context0) {
        try {
            context0.getClassLoader().loadClass("com.google.android.gms.providerinstaller.ProviderInstallerImpl").getMethod("insertProvider", Context.class).invoke(null, context0);
        }
        catch(Exception exception0) {
            Log.e("ProviderInstallerImpl", "Failed to call insertProvider of ProviderInstallerImpl stub via reflection!");
            throw new SecurityException(exception0);
        }
    }

    public static void reportRequestStats2(Context context0, long v, long v1) {
    }
}

