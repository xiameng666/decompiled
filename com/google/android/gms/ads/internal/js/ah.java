package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.util.v;
import com.google.android.gms.ads.nonagon.util.logging.cui.a;
import com.google.android.gms.ads.nonagon.util.logging.cui.b;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;

public final class ah {
    public final Object a;
    public final Context b;
    public final String c;
    public final VersionInfoParcel d;
    public final o e;
    public final v f;
    public ag g;
    public int h;
    private final v i;

    public ah(Context context0, VersionInfoParcel versionInfoParcel0, String s, v v0, v v1, o o0) {
        this.a = new Object();
        this.h = 1;
        this.c = s;
        this.b = context0.getApplicationContext();
        this.d = versionInfoParcel0;
        this.e = o0;
        this.f = v0;
        this.i = v1;
    }

    public final ag a() {
        b b0 = a.a(this.b, 6);
        b0.k();
        ag ag0 = new ag(this.i);
        r r0 = new r(this, ag0);
        e.c.execute(r0);
        ag0.i(new w(this, ag0, b0), new x(this, ag0, b0));
        return ag0;
    }
}

