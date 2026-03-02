package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.util.Base64;
import bbfw;
import bblp;
import com.android.volley.RequestQueue;
import glzd;
import gmap;
import gmbt;
import gmcd;
import gmcg;

public final class n {
    public final RequestQueue a;
    public final gmcg b;

    public n() {
        this.b = new bblp(1, 9);
        this.a = bbfw.b();
    }

    public final gmcd a(Context context0, byte[] arr_b, byte[] arr_b1) {
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        m m0 = new m(this, Base64.encodeToString(arr_b, 2), Base64.encodeToString(arr_b1, 2), context0);
        return glzd.f(glzd.g(glzd.f(glzd.f(gmbt.h(this.b.e(m0)), new f(), gmap.a), new g(arr_b, arr_b1), this.b), new h(this), this.b), new i(), gmap.a);
    }
}

