package com.google.android.gms.security.safebrowsing;

import android.content.Intent;
import android.os.IBinder;
import bbdg;
import ccmq;
import cllr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import elki;

public class SafeBrowsingUpdateTaskChimeraService extends GmsTaskChimeraService {
    private final IBinder a;

    static {
    }

    public SafeBrowsingUpdateTaskChimeraService() {
        this.a = new elki(this);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.jL);
        this.startService(IntentOperation.getStartIntent(this, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.safebrowsing.ACTION_XLB_UPDATE"));
        return 0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        SafeBrowsingUpdateChimeraIntentService.a(this);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final IBinder onBind(Intent intent0) {
        IBinder iBinder0 = super.onBind(intent0);
        return iBinder0 == null ? this.a : iBinder0;
    }
}

