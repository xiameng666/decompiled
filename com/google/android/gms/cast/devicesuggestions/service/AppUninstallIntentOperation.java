package com.google.android.gms.cast.devicesuggestions.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import auej;
import auez;
import aufd;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import ggtj;
import ibuq;
import java.util.concurrent.Executor;

public final class AppUninstallIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        AppUninstallIntentOperation.a = bboh.b("device_suggestions", bbcu.gU);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && ibuq.m(intent0.getAction(), "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            Context context0 = this.getApplicationContext();
            ibuq.c(context0);
            if(!aufd.c(context0)) {
                ((ggtj)AppUninstallIntentOperation.a.h()).x("Device suggestions feature unavailable; ignoring intent action.");
                return;
            }
            if(!aufd.e(ModuleManager.get(context0))) {
                ((ggtj)AppUninstallIntentOperation.a.h()).x("Intent engine unavailable; ignoring intent action.");
                return;
            }
            Uri uri0 = intent0.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(s != null && s.length() != 0) {
                try {
                    ((ggtj)AppUninstallIntentOperation.a.h()).B("Clearing data for %s because of app uninstall.", s);
                    auez auez0 = auej.a(s);
                    Executor executor0 = this.getApplicationContext().getMainExecutor();
                    ibuq.e(executor0, "getMainExecutor(...)");
                    auez0.a(executor0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    ((ggtj)AppUninstallIntentOperation.a.h()).B("%s; nothing to clear.", illegalArgumentException0);
                }
                return;
            }
            ((ggtj)AppUninstallIntentOperation.a.h()).x("Package name is empty; ignoring intent action.");
        }
    }
}

