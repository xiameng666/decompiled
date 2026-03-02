package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import com.google.android.gms.ads.internal.appcontent.d;
import com.google.android.gms.ads.internal.flag.f;
import com.google.android.gms.ads.internal.util.client.h;
import jeb.synthetic.FIN;

public final class e implements Runnable {
    public final g a;

    public e(g g0) {
        this.a = g0;
    }

    @Override
    public final void run() {
        g g0 = this.a;
        if(g0.b) {
            g0.a();
            if(g0.t) {
                g0.a();
                if(!g0.u) {
                    goto label_6;
                }
            }
            else {
            label_6:
                if(((Boolean)f.b.d()).booleanValue()) {
                    Object object0 = g0.a;
                    __monitor_enter(object0);
                    try {
                        if(Looper.getMainLooper() == null) {
                            return;
                        }
                        if(g0.e == null) {
                            g0.e = new d();
                        }
                        d d0 = g0.e;
                        Object object1 = d0.b;
                        __monitor_enter(object1);
                        int v1 = FIN.finallyOpen$NT();
                        if(d0.a) {
                            h.d("Content hash thread already started, quitting...");
                            FIN.finallyExec$NT(v1);
                        }
                        else {
                            d0.a = true;
                            FIN.finallyCodeBegin$NT(v1);
                            d0.start();
                        }
                        h.i("start fetching content...");
                    }
                    finally {
                        __monitor_exit(object0);
                    }
                }
            }
        }
    }
}

