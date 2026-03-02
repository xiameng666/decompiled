package com.google.android.gms.security.verifier;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class InternalApkUploadChimeraService.PackageChangeBroadcastReceiver extends TracingBroadcastReceiver {
    public InternalApkUploadChimeraService.PackageChangeBroadcastReceiver(InternalApkUploadChimeraService internalApkUploadChimeraService0) {
        Objects.requireNonNull(internalApkUploadChimeraService0);
        super("security");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        InternalApkUploadChimeraService.b(context0, ((long)InternalApkUploadChimeraService.b));
    }
}

