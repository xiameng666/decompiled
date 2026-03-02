package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import bjia;

public final class l {
    public static int a(Context context0) {
        return bjia.b(context0, "com.google.android.gms.ads.dynamite");
    }

    public static Object b(Context context0, String s, j j0) {
        try {
            bjia bjia0 = bjia.f(context0, bjia.a, "com.google.android.gms.ads.dynamite");
            return j0.a(bjia0.e(s));
        }
        catch(Exception exception0) {
            try {
                throw new k(exception0);
            }
            catch(Exception exception1) {
            }
        }
        throw new k(exception1);
    }
}

