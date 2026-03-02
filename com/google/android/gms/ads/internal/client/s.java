package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;

public final class s {
    public final f a;
    public final d b;
    public com.google.android.gms.ads.internal.report.f c;

    public s(f f0, d d0) {
        this.a = f0;
        this.b = d0;
    }

    public static void a(Context context0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("action", "no_ads_fallback");
        bundle0.putString("flow", s);
        u.b().k(context0, u.c().a, bundle0);
    }
}

