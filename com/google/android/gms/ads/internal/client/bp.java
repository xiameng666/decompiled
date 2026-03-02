package com.google.android.gms.ads.internal.client;

import android.view.View;
import bjgw;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class bp implements Runnable {
    public final br a;
    public final bjgw b;

    public bp(br br0, bjgw bjgw0) {
        this.a = br0;
        this.b = bjgw0;
    }

    @Override
    public final void run() {
        View view0 = (View)ObjectWrapper.a(this.b);
        this.a.g.addView(view0);
    }
}

