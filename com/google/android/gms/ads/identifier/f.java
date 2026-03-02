package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import batw;
import batx;
import baul;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public final class f {
    public static volatile f a;
    public static final Object b;
    public final AtomicLong c;
    private final batw d;

    static {
        f.b = new Object();
    }

    public f(Context context0) {
        this.c = new AtomicLong(-1L);
        this.d = new baul(context0, new batx("ads_identifier:api"));
    }

    public final void a(int v, int v1, long v2, long v3, int v4) {
        synchronized(this) {
            long v6 = SystemClock.elapsedRealtime();
            Log.i("AdvertisingIdClient", "shouldSendLog " + this.c.get());
            if(this.c.get() != -1L && v6 - this.c.get() <= 1800000L) {
                return;
            }
            TelemetryData telemetryData0 = new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(v, v1, 0, v2, v3, null, null, 0, v4)}));
            this.d.b(telemetryData0).A(new e(this, v6));
        }
    }
}

