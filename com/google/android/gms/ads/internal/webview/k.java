package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.csi.b;
import java.util.LinkedHashMap;

public final class k implements Runnable {
    public final String a;

    public k(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        b b0 = c.d().a();
        String s = this.a;
        if(b0.g.contains(s)) {
            return;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("sdkVersion", b0.f);
        linkedHashMap0.put("ue", s);
        b0.b(b0.a(b0.b, linkedHashMap0), null);
    }
}

