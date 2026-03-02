package com.google.android.gms.ads.cache.csi;

import android.os.Looper;
import clht;

public final class a implements Runnable {
    public volatile boolean a;
    private static final clht b;
    private final int c;
    private final Runnable d;

    static {
        a.b = new clht(Looper.getMainLooper());
    }

    public a(int v, Runnable runnable0) {
        this.a = false;
        this.c = v;
        this.d = runnable0;
    }

    public final void a() {
        this.a = true;
    }

    public final void b() {
        a.b.removeCallbacks(this);
        a.b.postDelayed(this, ((long)this.c));
    }

    @Override
    public final void run() {
        if(!this.a) {
            this.d.run();
            this.b();
        }
    }
}

