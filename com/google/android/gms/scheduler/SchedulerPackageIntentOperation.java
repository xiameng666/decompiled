package com.google.android.gms.scheduler;

import android.content.Intent;
import android.net.Uri;
import android.os.UserHandle;
import android.text.TextUtils;
import batl;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;
import ekqd;
import eksg;

public class SchedulerPackageIntentOperation extends IntentOperation {
    public static eksg a(Intent intent0, int v) {
        Uri uri0 = intent0.getData();
        String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
        return TextUtils.isEmpty(s) ? null : new eksg(s, v);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.sp);
        if("android.intent.action.PACKAGE_ADDED".equals(intent0.getAction()) && intent0.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        ekqd.e(this);
        if(ekqd.b() == 0) {
            SchedulerProxyIntentOperation.a(intent0, 0);
            return;
        }
        Intent intent1 = new Intent("com.google.android.gms.gcm.nts.USER_FORWARD");
        intent1.setPackage("com.google.android.gms");
        intent1.putExtra("intent", intent0);
        intent1.putExtra("userSerial", ekqd.b());
        if(ekqd.f()) {
            Object object0 = ekqd.d(0);
            batl.s(object0);
            this.sendBroadcastAsUser(intent1, ((UserHandle)object0));
            return;
        }
        this.sendBroadcast(intent1);
    }
}

