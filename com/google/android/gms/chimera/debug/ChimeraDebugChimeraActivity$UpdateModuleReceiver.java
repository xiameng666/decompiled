package com.google.android.gms.chimera.debug;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ibuq;

final class ChimeraDebugChimeraActivity.UpdateModuleReceiver extends TracingBroadcastReceiver {
    final ChimeraDebugChimeraActivity a;

    public ChimeraDebugChimeraActivity.UpdateModuleReceiver(ChimeraDebugChimeraActivity chimeraDebugChimeraActivity0) {
        this.a = chimeraDebugChimeraActivity0;
        super("chimera");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        if(ibuq.m("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", intent0.getAction())) {
            this.a.a();
        }
    }
}

