package com.google.android.gms.auth.folsom.recovery;

import ajxp;
import akdv;
import akdz;
import akea;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import baun;
import bbdg;
import bblp;
import ccmq;
import com.google.android.chimera.IntentOperation;
import gmcg;
import hfst;
import hpuq;
import java.util.UUID;

public class KeyRecoveryIntentOperation extends IntentOperation {
    public static final baun a;
    public String b;
    private final gmcg c;

    static {
        KeyRecoveryIntentOperation.a = akea.a("KeyRecoveryIntentOperation");
    }

    public KeyRecoveryIntentOperation() {
        this.c = new bblp(1, 10);
    }

    protected KeyRecoveryIntentOperation(Context context0) {
        this.c = new bblp(1, 10);
        this.attachBaseContext(context0);
    }

    public final void a(PendingIntent pendingIntent0, int v) {
        this.b(pendingIntent0, v, null);
    }

    public final void b(PendingIntent pendingIntent0, int v, hfst hfst0) {
        this.c(v);
        Intent intent0 = new Intent();
        if(hfst0 != null) {
            switch(v) {
                case 3: {
                    intent0.putExtra("android.security.action.EXTRA_COOL_OFF_PERIOD_SECONDS", hfst0.b);
                    break;
                }
                case 7: {
                    v = 7;
                    intent0.putExtra("android.security.action.EXTRA_COOL_OFF_PERIOD_SECONDS", hfst0.b);
                }
            }
        }
        intent0.putExtra("com.google.android.gms.auth.folsom.EXTRA_RECOVERY_RESULT", v - 1);
        try {
            pendingIntent0.send(this, -1, intent0);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            KeyRecoveryIntentOperation.a.g("Canceled sending PendingIntent.", pendingIntent$CanceledException0, new Object[0]);
            this.c(18);
        }
    }

    private final void c(int v) {
        akdz.l(v, 6, this.b);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.mM);
        this.b = UUID.randomUUID().toString();
        if(!akdv.a) {
            Object[] arr_object = {intent0.getAction()};
            KeyRecoveryIntentOperation.a.h("Build is lower than P. No need to handle [%s]", arr_object);
            return;
        }
        if(!hpuq.c()) {
            KeyRecoveryIntentOperation.a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String s = intent0.getAction();
        baun baun0 = KeyRecoveryIntentOperation.a;
        baun0.j("onHandleIntent. action: %s", new Object[]{s});
        if(!"com.google.android.gms.auth.folsom.START_RECOVERY".equals(s)) {
            return;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            baun0.f("Intent has null extras.", new Object[0]);
            return;
        }
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT");
        if(pendingIntent0 == null) {
            baun0.f("Stop recovery since the received intent does not contain a PendingIntent.", new Object[0]);
            return;
        }
        ajxp ajxp0 = new ajxp(this, bundle0, pendingIntent0);
        this.c.execute(ajxp0);
    }
}

