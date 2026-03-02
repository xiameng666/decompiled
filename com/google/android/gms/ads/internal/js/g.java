package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.webview.r;
import com.google.android.gms.ads.internal.webview.x;

public final class g implements Runnable {
    public final k a;
    public final String b;

    public g(k k0, String s) {
        this.a = k0;
        this.b = s;
    }

    @Override
    public final void run() {
        ((x)((r)this.a.a).a).u(this.b);
    }
}

