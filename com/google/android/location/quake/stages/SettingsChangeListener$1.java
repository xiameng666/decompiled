package com.google.android.location.quake.stages;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fxpb;
import j..util.Objects;

public class SettingsChangeListener.1 extends TracingBroadcastReceiver {
    final fxpb a;

    public SettingsChangeListener.1(fxpb fxpb0) {
        Objects.requireNonNull(fxpb0);
        this.a = fxpb0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        intent0.getAction();
        if(intent0.getAction() != null) {
            fxpb fxpb0 = this.a;
            if(intent0.getAction().equals("android.location.MODE_CHANGED") || intent0.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || intent0.getAction().equals("android.intent.action.AIRPLANE_MODE")) {
                fxpb0.i.a();
            }
            else if(intent0.getAction().equals("com.google.android.gms.phenotype.COMMITTED")) {
                if("com.google.android.location".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                    fxpb0.i.a();
                }
            }
            else if(fxpb0.d(intent0.getAction())) {
                fxpb0.i.a();
            }
        }
    }
}

