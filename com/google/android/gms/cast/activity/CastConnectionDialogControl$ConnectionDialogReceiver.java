package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import atty;
import audi;
import audm;
import ausd;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;
import jwe;

public class CastConnectionDialogControl.ConnectionDialogReceiver extends TracingBroadcastReceiver {
    final atty a;
    private boolean b;

    public CastConnectionDialogControl.ConnectionDialogReceiver(atty atty0) {
        Objects.requireNonNull(atty0);
        this.a = atty0;
        super("cast");
        this.b = false;
    }

    public final void b() {
        if(this.b) {
            return;
        }
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.cast.activity.DIALOG_ACTION_STATE_CHANGE");
        jwe.c(this.a.b, this, intentFilter0, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        this.b = true;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v1;
        int v = intent0.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 1);
        if(v == 0) {
            this.a.c = 4;
            this.a.a.c("ConnectionDialogReceiver got an Intent with DIALOG_OPENED", new Object[0]);
            return;
        }
        atty atty0 = this.a;
        atty0.c = 1;
        if(this.b) {
            atty0.b.unregisterReceiver(this);
            this.b = false;
        }
        atty0.a.c("ConnectionDialogReceiver got an Intent with DIALOG_CLOSED and action result %d", new Object[]{v});
        audi audi0 = atty0.d;
        if(audi0 != null) {
            switch(v) {
                case 1: {
                    break;
                }
                case 2: {
                    v1 = intent0.getIntExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", -1);
                    goto label_19;
                }
                case 3: {
                    v1 = 2019;
                label_19:
                    audm audm0 = audi0.a;
                    ausd ausd0 = audm0.d;
                    if(ausd0 != null) {
                        audm0.n.c("notify application launch failed with statusCode: %d", new Object[]{v1});
                        ausd0.g(ausd0.c, v1);
                        return;
                    }
                    break;
                }
                case 4: {
                    audi0.a.n.c("retry the application launch", new Object[0]);
                    audi0.a.a(audi0.a.e.a, audi0.a.e.b, audi0.a.e.c, audi0.a.e.d);
                    return;
                }
                default: {
                    v1 = -1;
                    goto label_19;
                }
            }
        }
    }
}

