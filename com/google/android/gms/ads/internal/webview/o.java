package com.google.android.gms.ads.internal.webview;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.clearcut.b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gful_cronetEngineProvider;

public final class o implements gful_cronetEngineProvider {
    public final Context a;
    public final ai b;
    public final VersionInfoParcel c;
    public final b d;

    public o(Context context0, ai ai0, VersionInfoParcel versionInfoParcel0, b b0) {
        this.a = context0;
        this.b = ai0;
        this.c = versionInfoParcel0;
        this.d = b0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0;
        try {
            TrafficStats.setThreadStatsTag(0x108);
            object0 = new r(new x(new ah(this.a), this.b, this.c, this.d));
            ae ae0 = new ae(((i)object0), this.d);
            object0.a.setWebViewClient(ae0);
            h h0 = new h(((i)object0));
            object0.a.setWebChromeClient(h0);
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
        return object0;
    }
}

