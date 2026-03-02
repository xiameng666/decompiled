package com.google.android.gms.common.appdoctor;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import badd;
import bade;
import badv;
import bael;
import bbpz;
import com.google.android.chimera.IntentOperation;
import glyq;
import glzd;
import gmbt;
import java.util.concurrent.ExecutionException;

public final class AppDoctorConfigChangedIntentOperation extends IntentOperation {
    static final String a;

    static {
        AppDoctorConfigChangedIntentOperation.a = bbpz.f("com.google.android.gms.appdoctor");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0.getAction() != null) {
            String s = intent0.getAction();
            if(AppDoctorConfigChangedIntentOperation.a.equals(s) && "com.google.android.gms.appdoctor".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                if(this.getPackageManager().getComponentEnabledSetting(new ComponentName("com.google.android.gms", "com.google.android.gms.common.appdoctor.AppDoctorProvider")) != 1) {
                    Log.i("AppDoctorConfigChanged", "Enabling ContentProvider.");
                    AppDoctorChimeraProvider.a(this);
                }
                Log.i("AppDoctorConfigChanged", "Refreshing configuration on flag commit.");
                try {
                    badv badv0 = badv.a();
                    bael bael0 = new bael();
                    ((glyq)glzd.g(glzd.g(gmbt.h(badv0.c.b.b(bael0, badv0.b)), new badd(badv0, this), badv0.b), new bade(badv0, this), badv0.b)).u();
                }
                catch(InterruptedException | ExecutionException exception0) {
                    Log.e("AppDoctorConfigChanged", "Failed to update config.", exception0);
                }
            }
        }
    }
}

