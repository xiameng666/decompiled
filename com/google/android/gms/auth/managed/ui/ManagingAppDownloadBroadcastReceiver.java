package com.google.android.gms.auth.managed.ui;

import akmy;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import batl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import jwe;

public class ManagingAppDownloadBroadcastReceiver extends TracingBroadcastReceiver {
    private final Context a;
    private boolean b;
    private final akmy c;

    public ManagingAppDownloadBroadcastReceiver(Context context0, akmy akmy0) {
        super("auth_managed");
        batl.s(context0);
        this.a = context0;
        this.c = akmy0;
    }

    public final void b() {
        synchronized(this) {
            if(!this.b) {
                IntentFilter intentFilter0 = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
                jwe.b(this.a, this, intentFilter0, 2);
                this.b = true;
            }
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.b) {
                this.a.unregisterReceiver(this);
                this.b = false;
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("android.intent.action.DOWNLOAD_COMPLETE".equals(intent0.getAction())) {
            akmy akmy0 = this.c;
            if(Long.valueOf(intent0.getLongExtra("extra_download_id", -1L)).equals(Long.valueOf(akmy0.a))) {
                akmy0.b = true;
            }
        }
    }
}

