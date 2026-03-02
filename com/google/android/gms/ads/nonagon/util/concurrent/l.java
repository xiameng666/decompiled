package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.util.event.e;

public final class l implements Runnable {
    public final n a;
    public final h b;

    public l(n n0, h h0) {
        this.a = n0;
        this.b = h0;
    }

    @Override
    public final void run() {
        e e0 = new e(this.b);
        this.a.a.b.d(e0);
    }
}

