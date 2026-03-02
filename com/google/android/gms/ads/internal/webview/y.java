package com.google.android.gms.ads.internal.webview;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.h;

public final class y implements Runnable {
    public final aa a;
    public final String b;

    public y(aa aa0, String s) {
        this.a = aa0;
        this.b = s;
    }

    @Override
    public final void run() {
        Uri uri0 = Uri.parse(this.b);
        n n0 = ((x)this.a.a.a).b;
        if(n0 == null) {
            h.f("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        n0.d(uri0);
    }
}

