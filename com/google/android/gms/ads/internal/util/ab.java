package com.google.android.gms.ads.internal.util;

import android.content.Context;
import bbna;
import com.android.volley.RequestQueue;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.g;
import gmcd;
import java.util.Map;

public final class ab {
    private static RequestQueue a;
    private static final Object b;

    static {
        ab.b = new Object();
    }

    public ab(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(ab.b) {
            if(ab.a == null) {
                s.c(context0);
                ab.a = bbna.d() || !((Boolean)s.au.g()).booleanValue() ? Volley.newRequestQueue(context0) : com.google.android.gms.ads.internal.util.s.a(context0, new com.google.android.gms.ads.internal.util.s(context0, new HurlStack()));
            }
        }
    }

    public final gmcd a(int v, String s, Map map0, byte[] arr_b) {
        gmcd gmcd0 = new y();
        w w0 = new w(this, s, ((y)gmcd0));
        new g(null);
        x x0 = new x(this, v, s, ((Response.Listener)gmcd0), w0, arr_b, map0);
        ab.a.add(x0);
        return gmcd0;
    }
}

