package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;
import baun;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import epzi;
import epzj;
import j..util.Objects;

public class SourceAccountExportController.ExportReceiver extends TracingBroadcastReceiver {
    public final epzj a;

    public SourceAccountExportController.ExportReceiver(epzj epzj0) {
        Objects.requireNonNull(epzj0);
        this.a = epzj0;
        super("smartdevice");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        baun baun0 = epzj.a;
        baun0.j("Received broadcast %s", new Object[]{intent0});
        if(!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(intent0.getAction())) {
            baun0.f("Unexpected broadcast action %s", new Object[]{intent0.getAction()});
            return;
        }
        epzi epzi0 = new epzi(this, intent0.getStringArrayExtra("key_extra_ids"));
        this.a.d.execute(epzi0);
    }
}

