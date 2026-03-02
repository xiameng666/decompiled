package com.google.android.gms.cast.rcn;

import android.content.Intent;
import auno;
import aval;
import avjh;
import azts;
import azzc;
import com.google.android.chimera.IntentOperation;
import hqpo;

public class CastRemoteControlNotificationIntentOperation extends IntentOperation {
    public static final avjh a;
    public Intent b;

    static {
        CastRemoteControlNotificationIntentOperation.a = new avjh("RCNIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(hqpo.c()) {
            Intent intent0 = new Intent("com.google.android.gms.cast.rcn.CastPersistentAction");
            this.b = intent0;
            intent0.setPackage("com.google.android.gms");
            return;
        }
        Intent intent1 = new Intent();
        this.b = intent1;
        intent1.setClassName(this.getApplicationContext(), "com.google.android.gms.cast.service.CastPersistentService");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        avjh avjh0 = CastRemoteControlNotificationIntentOperation.a;
        avjh0.n("onHandleIntent %s", intent0);
        if(intent0 == null) {
            avjh0.g("onHandleIntent received a null intent", new Object[0]);
            return;
        }
        if("android.intent.action.USER_PRESENT".equals(intent0.getAction())) {
            azts azts0 = new azts(this, null);
            azzc azzc0 = new azzc();
            azzc0.d = 0x20E3;
            azzc0.a = new auno(azts0);
            azts0.iG(azzc0.a()).z(new aval(this));
        }
    }
}

