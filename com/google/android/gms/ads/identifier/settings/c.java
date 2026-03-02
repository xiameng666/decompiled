package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.config.s;
import hotc;

public final class c implements Runnable {
    public final Context a;
    public final Bundle b;

    public c(Context context0, Bundle bundle0) {
        this.a = context0;
        this.b = bundle0;
    }

    @Override
    public final void run() {
        try {
            this.b.putString("cl", "800653487");
            this.b.putString("r_cl", "HEAD");
            s.c(this.a);
            com.google.android.gms.ads.internal.c.e().m(this.a, d.a, "event-attestation", this.b);
        }
        catch(RuntimeException runtimeException0) {
            if(hotc.c()) {
                return;
            }
            throw runtimeException0;
        }
    }
}

