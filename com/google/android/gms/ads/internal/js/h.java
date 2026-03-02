package com.google.android.gms.ads.internal.js;

public final class h implements Runnable {
    public final k a;
    public final String b;

    public h(k k0, String s) {
        this.a = k0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.a.loadData(this.b, "text/html", "UTF-8");
    }
}

