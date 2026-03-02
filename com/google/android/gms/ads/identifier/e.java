package com.google.android.gms.ads.identifier;

import android.util.Log;
import aztb;
import com.google.android.gms.common.ConnectionResult;
import evqc;

public final class e implements evqc {
    public final f a;
    public final long b;

    public e(f f0, long v) {
        this.a = f0;
        this.b = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.i("AdvertisingIdClient", "getting error as " + exception0.getMessage());
        if((exception0 instanceof aztb)) {
            ConnectionResult connectionResult0 = ((aztb)exception0).a.l;
            if(connectionResult0 != null && connectionResult0.c == 24) {
                this.a.c.set(this.b);
            }
        }
    }
}

