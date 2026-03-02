package com.google.android.gms.ads.social;

import android.content.Context;
import com.google.android.gms.ads.internal.util.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.atomic.AtomicBoolean;

final class z {
    static final AtomicBoolean a;
    public final Context b;
    public final GmsDoritosProvider c;
    public final VersionInfoParcel d;
    public final ab e;
    final aa f;
    public static final int g;

    static {
        z.a = new AtomicBoolean(false);
    }

    public z(Context context0, GmsDoritosProvider gmsDoritosProvider0, aa aa0, VersionInfoParcel versionInfoParcel0, ab ab0) {
        this.b = context0;
        this.c = gmsDoritosProvider0;
        this.f = aa0;
        this.d = versionInfoParcel0;
        this.e = ab0;
    }
}

