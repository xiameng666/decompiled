package com.google.android.gms.fitness.service.sync;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import j..util.Objects;

class SyncGcmTaskChimeraService.1 extends ResultReceiver {
    final Context a;
    final Bundle b;
    final String c;
    final SyncGcmTaskChimeraService d;

    public SyncGcmTaskChimeraService.1(SyncGcmTaskChimeraService syncGcmTaskChimeraService0, Context context0, Bundle bundle0, String s) {
        this.a = context0;
        this.b = bundle0;
        this.c = s;
        Objects.requireNonNull(syncGcmTaskChimeraService0);
        this.d = syncGcmTaskChimeraService0;
        super(null);
    }

    @Override  // android.os.ResultReceiver
    public final void onReceiveResult(int v, Bundle bundle0) {
        this.d.f(this.a, this.b, this.c, 0L);
    }
}

