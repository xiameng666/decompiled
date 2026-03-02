package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;
import clht;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cpdg;
import j..util.Objects;

public class HotspotEnabler.WifiApStateBroadcastReceiver extends TracingBroadcastReceiver {
    public final Handler a;
    public Runnable b;
    public final cpdg c;
    private final ResultReceiver d;

    public HotspotEnabler.WifiApStateBroadcastReceiver(cpdg cpdg0, ResultReceiver resultReceiver0) {
        Objects.requireNonNull(cpdg0);
        this.c = cpdg0;
        super("auth_magictether");
        this.d = resultReceiver0;
        this.a = new clht();
    }

    public final void b(Context context0, int v) {
        cpdg.d(this.d, v, null);
        context0.unregisterReceiver(this);
        this.a.removeCallbacks(this.b);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent0.getAction())) {
            int v = intent0.getIntExtra("wifi_state", -1);
            if(v == 13) {
                this.b(context0, 0);
                return;
            }
            if(v == 14) {
                this.b(context0, 2);
            }
        }
    }
}

