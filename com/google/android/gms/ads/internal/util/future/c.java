package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.ads.internal.util.m;
import java.util.concurrent.Executor;

final class c implements Executor {
    private final Handler a;

    public c() {
        this.a = new d(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable0.run();
                return;
            }
            catch(Throwable throwable0) {
                m.l(com.google.android.gms.ads.internal.c.d().d, throwable0);
                throw throwable0;
            }
        }
        this.a.post(runnable0);
    }
}

