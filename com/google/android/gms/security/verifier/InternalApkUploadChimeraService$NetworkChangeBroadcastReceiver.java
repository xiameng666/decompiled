package com.google.android.gms.security.verifier;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class InternalApkUploadChimeraService.NetworkChangeBroadcastReceiver extends TracingBroadcastReceiver {
    final InternalApkUploadChimeraService a;

    public InternalApkUploadChimeraService.NetworkChangeBroadcastReceiver(InternalApkUploadChimeraService internalApkUploadChimeraService0) {
        Objects.requireNonNull(internalApkUploadChimeraService0);
        this.a = internalApkUploadChimeraService0;
        super("security");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        this.a.e.a(context0);
    }
}

