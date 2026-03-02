package com.google.android.gms.common.appdoctor;

import android.content.Intent;
import android.util.Log;
import avzf;
import badv;
import com.google.android.chimera.IntentOperation;
import glyq;
import java.util.concurrent.ExecutionException;

public class AppDoctorInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void c(Intent intent0) {
        AppDoctorChimeraProvider.a(this);
        Intent intent1 = IntentOperation.getStartIntent(this, AppDoctorConfigChangedIntentOperation.class, AppDoctorConfigChangedIntentOperation.a);
        if(intent1 != null) {
            intent1.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", "com.google.android.gms.appdoctor");
            this.startService(intent1);
        }
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        AppDoctorChimeraProvider.a(this);
        try {
            ((glyq)badv.a().f(this)).u();
        }
        catch(ExecutionException | InterruptedException exception0) {
            Log.w("AppDoctorInit", "Failed to reset Uri Permissions", exception0);
        }
    }
}

