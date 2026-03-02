package com.google.android.gms.ads.internal.webview;

import java.util.HashMap;

public final class l implements Runnable {
    public final n a;
    public final boolean b;
    public final long c;

    public l(n n0, boolean z, long v) {
        this.a = n0;
        this.b = z;
        this.c = v;
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("success", (this.b ? "1" : "0"));
        hashMap0.put("duration", Long.toString(this.c));
        ((x)((r)this.a.a).a).t("onCacheAccessComplete", hashMap0);
    }
}

