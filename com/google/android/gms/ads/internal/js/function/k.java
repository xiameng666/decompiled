package com.google.android.gms.ads.internal.js.function;

import android.content.Context;
import com.google.android.gms.ads.internal.js.ah;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.v;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;

public final class k {
    static final v a;
    static final v b;
    private final ah c;

    static {
        k.a = new i();
        k.b = new j();
    }

    public k(Context context0, VersionInfoParcel versionInfoParcel0, String s, o o0) {
        this.c = new ah(context0, versionInfoParcel0, s, k.a, k.b, o0);
    }

    public final com.google.android.gms.ads.internal.js.function.o a(String s, d d0, c c0) {
        return new com.google.android.gms.ads.internal.js.function.o(this.c, s, d0, c0);
    }
}

