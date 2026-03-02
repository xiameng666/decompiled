package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.config.s;
import java.util.concurrent.Callable;

public final class h implements Callable {
    public final WebSettings a;
    public final Context b;

    public h(WebSettings webSettings0, Context context0) {
        this.a = webSettings0;
        this.b = context0;
    }

    @Override
    public final Object call() {
        String s = this.b.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
        WebSettings webSettings0 = this.a;
        webSettings0.setDatabasePath(s);
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setSupportZoom(true);
        if(((Boolean)s.G.g()).booleanValue()) {
            webSettings0.setTextZoom(100);
        }
        webSettings0.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}

