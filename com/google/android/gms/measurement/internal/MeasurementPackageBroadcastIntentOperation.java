package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import crqj;
import crqq;

public final class MeasurementPackageBroadcastIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if("android.intent.action.PACKAGE_REMOVED".equals(intent0.getAction()) && !intent0.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            Uri uri0 = intent0.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            crqq crqq0 = crqq.y(this);
            if(s == null) {
                crqq0.aJ().f.a("Got package removed intent with a null package name");
            }
            else {
                crqq0.aJ().j.b("Got package removed intent", s);
                if(!"com.google.android.gms".equals(s) && crqq0.m().a) {
                    crqq0.av();
                    crqq0.aK().f(new crqj(crqq0, s, System.currentTimeMillis()));
                }
            }
        }
    }
}

