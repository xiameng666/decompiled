package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import com.google.android.gms.ads.clearcut.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.ExecutorService;

public final class g {
    boolean a;
    public final ExecutorService b;
    a c;

    public g() {
        this.b = b.b;
    }

    public g(Context context0) {
        this.b = b.b;
        c c0 = new c(this, context0);
        b.b.execute(c0);
    }
}

