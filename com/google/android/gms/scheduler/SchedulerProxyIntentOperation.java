package com.google.android.gms.scheduler;

import android.content.Intent;
import android.util.Log;
import batl;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;
import ekqd;
import ekrs;
import eksg;

public final class SchedulerProxyIntentOperation extends IntentOperation {
    public static void a(Intent intent0, int v) {
        batl.l(ekqd.b() == 0);
        if(v < 0) {
            Log.w("NetworkScheduler", "Dispatching intent with invalid user serial");
            return;
        }
        String s = intent0.getAction();
        if("android.intent.action.PACKAGE_REPLACED".equals(s)) {
            eksg eksg0 = SchedulerPackageIntentOperation.a(intent0, v);
            if(eksg0 == null) {
                return;
            }
            ekrs.b().f.b(eksg0);
            return;
        }
        if("android.intent.action.PACKAGE_FULLY_REMOVED".equals(s)) {
            eksg eksg1 = SchedulerPackageIntentOperation.a(intent0, v);
            if(eksg1 != null) {
                ekrs.b().f.c(eksg1);
            }
            return;
        }
        Log.w("NetworkScheduler", "Unexpected forwarded intent: " + intent0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.sp);
        if(!"com.google.android.gms.gcm.nts.USER_FORWARD".equals(intent0.getAction())) {
            Log.w("NetworkScheduler", "Unexpected intent: " + intent0);
            return;
        }
        Intent intent1 = (Intent)intent0.getParcelableExtra("intent");
        int v = intent0.getIntExtra("userSerial", -1);
        if(intent1 != null) {
            SchedulerProxyIntentOperation.a(intent1, v);
        }
    }
}

