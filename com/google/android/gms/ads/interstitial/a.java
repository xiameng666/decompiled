package com.google.android.gms.ads.interstitial;

import abaa;
import abae;
import android.content.Context;
import com.google.android.gms.ads.admanager.b;
import com.google.android.gms.ads.internal.report.d;

public final class a implements Runnable {
    public final Context a;
    public final String b;
    public final abae c;
    public final abaa d;

    public a(Context context0, String s, abae abae0, abaa abaa0) {
        this.a = context0;
        this.b = s;
        this.c = abae0;
        this.d = abaa0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.a;
            new b(context0, this.b).a(this.c.a, this.d);
        }
        catch(IllegalStateException illegalStateException0) {
            d.a(context0).e(illegalStateException0, "InterstitialAd.load");
        }
    }
}

