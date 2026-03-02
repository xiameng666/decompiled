package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;
import cllr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import elrh;
import hxvy;

public class SnetNormalTaskChimeraService extends GmsTaskChimeraService {
    private final IBinder a;

    static {
    }

    public SnetNormalTaskChimeraService() {
        this.a = new elrh(this);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        if(cllr0.a.hashCode() == 0xE2EDA342 && cllr0.a.equals("event_log_collector_runner") && hxvy.h()) {
            this.startService(IntentOperation.getStartIntent(this, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN"));
        }
        return 0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        SnetGcmSchedulerChimeraIntentService.a(this);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final IBinder onBind(Intent intent0) {
        IBinder iBinder0 = super.onBind(intent0);
        return iBinder0 == null ? this.a : iBinder0;
    }
}

