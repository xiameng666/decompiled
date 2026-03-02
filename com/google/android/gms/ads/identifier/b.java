package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class b extends Thread {
    final CountDownLatch a;
    private final WeakReference b;
    private final long c;

    public b(d d0, long v) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new WeakReference(d0);
        this.c = v;
        this.a = new CountDownLatch(1);
        this.start();
    }

    private final void a() {
        d d0 = (d)this.b.get();
        if(d0 != null) {
            d0.c();
        }
    }

    @Override
    public final void run() {
        try {
            if(!this.a.await(this.c, TimeUnit.MILLISECONDS)) {
                this.a();
            }
        }
        catch(InterruptedException unused_ex) {
            this.a();
        }
    }
}

