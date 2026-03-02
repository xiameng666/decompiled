package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.util.an;

public final class j implements Runnable {
    public final n a;

    public j(n n0) {
        this.a = n0;
    }

    @Override
    public final void run() {
        i i0 = this.a.a;
        an an0 = ((x)((r)i0).a).f;
        an0.b = true;
        if(an0.a) {
            an0.a();
        }
        i0.n();
    }
}

