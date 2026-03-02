package com.google.android.gms.nearby.fastpair.common;

import com.google.android.gms.libs.platform.foreground.ForegroundHelper.ForegroundListener;
import cyfa;
import cyfn;
import cysc;
import gfuy;
import ggtj;
import hvpg;
import j..util.Objects;
import java.util.ArrayList;

public class AppImportanceHelperWrapper.1 implements ForegroundHelper.ForegroundListener {
    final cyfa a;

    public AppImportanceHelperWrapper.1(cyfa cyfa0) {
        Objects.requireNonNull(cyfa0);
        this.a = cyfa0;
        super();
    }

    @Override  // com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener
    public final void a(int v, boolean z) {
        gfuy.e(this.a.a);
        String s = cyfn.g(this.a.a, v);
        ArrayList arrayList0 = new ArrayList(this.a.b);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            cysc cysc0 = (cysc)arrayList0.get(v2);
            if(hvpg.bJ()) {
                ((ggtj)cysc0.n.d().ar(8066)).S("WearScannerHelper: onImportanceChanged, packageName=%s, foreground=%b", s, z);
            }
            cysc0.k();
            if(hvpg.aL() > 0L) {
                Runnable runnable0 = cysc0.i;
                if(runnable0 != null) {
                    cysc0.h.removeCallbacks(runnable0);
                    Runnable runnable1 = cysc0.i;
                    long v3 = hvpg.aL();
                    cysc0.h.postDelayed(runnable1, v3);
                }
            }
        }
    }
}

