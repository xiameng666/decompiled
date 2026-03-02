package com.google.android.gms.ads.cache;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.cache.io.b;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import jeb.synthetic.FIN;

public final class ClearCacheIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        s.c(this.getApplicationContext());
        c.d().d(this.getApplicationContext(), new VersionInfoParcel(0xF1B18AD, 0xF1B18AD));
        f f0 = j.c(this);
        if(f0 != null) {
            try {
                b b0 = f0.a;
                __monitor_enter(b0);
                int v = FIN.finallyOpen$NT();
                com.google.android.gms.ads.cache.policy.b b1 = f0.d();
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = b1.b().iterator();
                while(true) {
                label_10:
                    if(!iterator0.hasNext()) {
                        for(Object object0: arrayList0) {
                            f0.h(((com.google.android.gms.ads.cache.s)object0));
                        }
                        FIN.finallyCodeBegin$NT(v);
                        return;
                    }
                    Object object1 = iterator0.next();
                    for(Object object2: b1.a(((String)object1))) {
                        arrayList0.add(((com.google.android.gms.ads.cache.s)object2));
                    }
                }
            }
            catch(g g0) {
                c.d().c(g0, "ClearCacheIntentOperation");
                return;
            }
            goto label_10;
        }
    }
}

