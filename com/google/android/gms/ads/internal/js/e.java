package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.webview.r;

public final class e implements Runnable {
    public final k a;
    public final String b;

    public e(k k0, String s) {
        this.a = k0;
        this.b = s;
    }

    @Override
    public final void run() {
        ((r)this.a.a).a.loadUrl(this.b);
    }
}

