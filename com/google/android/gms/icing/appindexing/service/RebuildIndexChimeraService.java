package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.os.Looper;
import batl;
import bwmx;
import bwne;
import bwqx;
import bwtu;
import bxav;
import bxax;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import hubn;

public abstract class RebuildIndexChimeraService extends GmsTaskChimeraService {
    private bxav a;
    private bwmx b;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        bwmx bwmx0 = this.b;
        boolean z = false;
        if(bwmx0 == null) {
            bwne.a("RebuildIndexService is unavailable on this device");
            return 0;
        }
        if(!hubn.g()) {
            bwne.a("Bail out as 3P appindexing is disabled.");
            return 0;
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            z = true;
        }
        batl.l(z);
        if(!bwmx0.F()) {
            bwne.a("IndexManager initialization failed. Rescheduling!");
            return 1;
        }
        Context context0 = this.getApplicationContext();
        bxax bxax0 = bwmx0.f;
        batl.s(bxax0);
        new bwtu(context0);
        return this.d(cllr0, new bwqx(context0, bxax0, bwmx0.r));
    }

    public abstract int d(cllr arg1, bwqx arg2);

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public void onCreate() {
        super.onCreate();
        if(hubn.i()) {
            bxav bxav0 = bxav.c(this.getApplicationContext());
            this.a = bxav0;
            if(bxav0 != null) {
                this.b = bxav0.a();
            }
        }
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onDestroy() {
        bxav bxav0 = this.a;
        if(bxav0 != null) {
            bxav0.b();
        }
        super.onDestroy();
    }
}

